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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
