package com.duyanhan.forum.dto;

/**
 * 查询页对象
 * @author duyanhan
 *
 */
public class QueryPage {

	private Integer page;
	private Integer pageSize;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
