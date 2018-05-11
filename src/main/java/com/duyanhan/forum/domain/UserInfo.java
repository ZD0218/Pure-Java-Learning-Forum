package com.duyanhan.forum.domain;

import java.util.List;

/**
 * 用户信息实体类
 * @author duyanhan
 *
 */
public class UserInfo {

	private Integer id;
	private String username;
	private String password;
	private String sex;
	private String personalDescription;
	// 一个用户可以发表多个帖子
	private List<Post> posts;
	// 一个用户可以发表多个回复
	private List<Comment> comments;
}
