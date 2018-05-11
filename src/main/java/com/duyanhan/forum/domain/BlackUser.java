package com.duyanhan.forum.domain;

import java.util.List;

/**
 * 黑名单用户实体类
 * @author duyanhan
 *
 */
public class BlackUser {

	private Integer id;
	private UserInfo user;
	// 一个黑名单对应多个被ban用户
	private List<UserInfo> users;
}
