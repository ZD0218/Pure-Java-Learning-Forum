package com.duyanhan.forum.dto;

public class QueryPageWithBlockId {

	private QueryPage queryPage;
	private Integer blockId;
	public QueryPage getQueryPage() {
		return queryPage;
	}
	public void setQueryPage(QueryPage queryPage) {
		this.queryPage = queryPage;
	}
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}
	@Override
	public String toString() {
		return "QueryPageWithBlockId [queryPage=" + queryPage + ", blockId=" + blockId + "]";
	}
	
}
