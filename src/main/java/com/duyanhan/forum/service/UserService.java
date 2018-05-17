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
}
