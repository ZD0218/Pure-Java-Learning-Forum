package com.duyanhan.forum.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.controller.frontstage.UserController;
import com.duyanhan.forum.dao.UserMapper;
import com.duyanhan.forum.dto.PasswordVO;
import com.duyanhan.forum.entity.User;
import com.duyanhan.forum.entity.UserExample;
import com.duyanhan.forum.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(User user) {
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> users = userMapper.selectByExample(userExample);
		if(users != null && users.size() > 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean register(User user) {
		
		int line = userMapper.insert(user);
		if(line > 0) {
			return true;
		}
		return false;
	}

	@Override
	public User getUserByUsernameAndPassword(User user) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> users = userMapper.selectByExample(userExample);
		if(users != null && users.size() > 0)
		{
			return users.get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public boolean updateUser(User user) {
		// 按主键更新
		int line = userMapper.updateByPrimaryKey(user);
		if(line > 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean updatePasswordByPasswordVO(User currentUser, PasswordVO passwordVO) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIdEqualTo(currentUser.getId()).andPasswordEqualTo(passwordVO.getOldPassword());
		User newUser = new User();
		newUser.setPassword(passwordVO.getNewPassword());
		// 按条件更新非空字段
		int line = userMapper.updateByExampleSelective(newUser, userExample);
		if(line > 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public User getUserById(User currentUser) {
		User user = userMapper.selectByPrimaryKey(currentUser.getId());
		return user;
	}


}
