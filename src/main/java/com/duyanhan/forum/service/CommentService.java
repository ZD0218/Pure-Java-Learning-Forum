package com.duyanhan.forum.service;

import java.util.List;

import com.duyanhan.forum.dto.QueryPageWithPostId;
import com.duyanhan.forum.entity.Comment;
import com.duyanhan.forum.entity.Post;

public interface CommentService {

	/**
	 * 发表评论
	 * @param comment
	 * @return
	 */
	boolean comment(Comment comment);

	/**
	 * 根据postId和分页对象查询评论列表
	 * @param queryPageWithPostId
	 * @return
	 */
	List<Comment> getCommentListByQueryPageWithPostId(QueryPageWithPostId queryPageWithPostId);

}
