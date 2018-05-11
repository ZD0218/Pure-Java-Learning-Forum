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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	
}
