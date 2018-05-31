package com.duyanhan.forum.dto;

public class QueryPageWithPostId {

	private QueryPage queryPage;
	private Integer postId;
	public QueryPage getQueryPage() {
		return queryPage;
	}
	public void setQueryPage(QueryPage queryPage) {
		this.queryPage = queryPage;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	@Override
	public String toString() {
		return "QueryPageWithPostId [queryPage=" + queryPage + ", postId=" + postId + "]";
	}
	
}
