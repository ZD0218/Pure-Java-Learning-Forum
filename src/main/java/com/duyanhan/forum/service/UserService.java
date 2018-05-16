package com.duyanhan.forum.service;

import com.duyanhan.forum.domain.UserInfo;

/**
 * 用户业务
 * @author duyanhan
 *
 */
public interface UserService {
	
	/**
	 * 登录业务
	 * @param userInfo
	 * @return
	 */
	boolean login(UserInfo userInfo);
}
