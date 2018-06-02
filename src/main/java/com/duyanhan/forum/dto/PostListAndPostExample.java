package com.duyanhan.forum.dto;

import java.util.List;

import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.PostExample;

public class PostListAndPostExample {

	private List<Post> postList;
	private PostExample postExample;
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	public PostExample getPostExample() {
		return postExample;
	}
	public void setPostExample(PostExample postExample) {
		this.postExample = postExample;
	}
	
}
