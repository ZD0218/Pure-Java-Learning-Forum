package com.duyanhan.forum.service;

import java.util.List;

import com.duyanhan.forum.dto.PostListAndTotalPostNumber;
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
	 * 根据分页对象和版块ID查询当前页面帖子列表和总帖子数
	 * @param queryPageWithBlockId
	 * @return
	 */
	PostListAndTotalPostNumber getPostListAndTotalPostNumberByQueryPageWithBlockId(QueryPageWithBlockId queryPageWithBlockId);

	/**
	 * 根据postId查询帖子
	 * @param postId
	 * @return
	 */
	Post getPostByPostId(Integer postId);
}
