package com.duyanhan.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.UserInfoMapper;
import com.duyanhan.forum.domain.UserInfo;
import com.duyanhan.forum.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public boolean login(UserInfo userInfo) {
		
		UserInfo user = userInfoMapper.selectByUsernameAndPassword(userInfo);
		if(user != null)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
