package com.duyanhan.forum.domain;

import java.util.Date;
import java.util.List;

/**
 * 帖子实体类
 * @author duyanhan
 *
 */
public class Post {

	private Integer id;
	private String title;
	private String content;
	private Date postTime;
	private Date updateTime;
	// 帖子归属的版块
	private Block block;
	// 帖子归属的用户
	private UserInfo user;
	// 一个帖子包含多个回复
	private List<Comment> comments;
	
}
