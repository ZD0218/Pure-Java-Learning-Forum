package com.duyanhan.forum.dto;

import java.util.List;

import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.PostExample;

public class PostListAndTotalPostNumber {

	private List<Post> postList;
	private Integer totalPostNumber;
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	public Integer getTotalPostNumber() {
		return totalPostNumber;
	}
	public void setTotalPostNumber(Integer totalPostNumber) {
		this.totalPostNumber = totalPostNumber;
	}
	public PostListAndTotalPostNumber(List<Post> postList, Integer totalPostNumber) {
		super();
		this.postList = postList;
		this.totalPostNumber = totalPostNumber;
	}
	
	
}
