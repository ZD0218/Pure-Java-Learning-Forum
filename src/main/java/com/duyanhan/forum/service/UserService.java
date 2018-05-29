package com.duyanhan.forum.service;

import com.duyanhan.forum.entity.User;

/**
 * 用户业务
 * @author duyanhan
 *
 */
public interface UserService {
	
	/**
	 * 登录业务
	 * @param user
	 * @return
	 */
	boolean login(User user);

	/**
	 * 注册业务
	 * @param user
	 * @return
	 */
	boolean register(User user);
	
	/**
	 * 获取用户信息
	 * @param user
	 * @return
	 */
	User getUserByUsernameAndPassword(User user);
}
