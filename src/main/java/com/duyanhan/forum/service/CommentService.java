package com.duyanhan.forum.service;

import com.duyanhan.forum.entity.Comment;

public interface CommentService {

	/**
	 * 发表评论
	 * @param comment
	 * @return
	 */
	boolean comment(Comment comment);

}
