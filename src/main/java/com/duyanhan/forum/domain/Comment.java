package com.duyanhan.forum.domain;

import java.util.Date;

/**
 * 回复实体类
 * @author duyanhan
 *
 */
public class Comment {

	private Integer id;
	private String content;
	private Date postTime;
	private Date updateTime;
	// 回复归属的帖子
	private Post post;
	// 回复归属的用户
	private UserInfo user;
}
