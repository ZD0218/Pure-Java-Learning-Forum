package com.duyanhan.forum.service;

import java.util.List;

import com.duyanhan.forum.dto.QueryPageWithBlockId;
import com.duyanhan.forum.entity.Post;

public interface PostService {

	/**
	 * 发表帖子
	 * @param post
	 * @return
	 */
	boolean post(Post post);

	/**
	 * 根据分页对象和版块ID查询帖子
	 * @param queryPageWithBlockId
	 * @return
	 */
	List<Post> getPageListByQueryPageWithBlockId(QueryPageWithBlockId queryPageWithBlockId);

	/**
	 * 根据postId查询帖子
	 * @param postId
	 * @return
	 */
	Post getPostByPostId(Integer postId);
}
