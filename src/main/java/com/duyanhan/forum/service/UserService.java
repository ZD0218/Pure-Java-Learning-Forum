package com.duyanhan.forum.service;

import com.duyanhan.forum.dto.PasswordVO;
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
	 * 根据用户名和密码获取用户信息
	 * @param user
	 * @return
	 */
	User getUserByUsernameAndPassword(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);

	/**
	 * 根据密码值对象更新用户密码
	 * @param currentUser 
	 * @param passwordVO
	 * @return
	 */
	boolean updatePasswordByPasswordVO(User currentUser, PasswordVO passwordVO);

	/**
	 * 根据id获取用户信息
	 * @param currentUser
	 * @return
	 */
	User getUserById(User currentUser);
	
	
}
