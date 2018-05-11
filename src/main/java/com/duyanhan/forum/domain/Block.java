package com.duyanhan.forum.domain;

import java.util.List;

/**
 * 版块实体类
 * @author duyanhan
 *
 */
public class Block {

	private Integer id;
	private String title;
	private String content;
	private Integer level;
	// 一个版块包含多个帖子
	private List<Post> postList;
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
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	
}
