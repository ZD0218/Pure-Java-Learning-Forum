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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPersonalDescription() {
		return personalDescription;
	}
	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
