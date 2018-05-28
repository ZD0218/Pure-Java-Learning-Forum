package com.duyanhan.forum.service;

import com.duyanhan.forum.entity.Post;

public interface PostService {

	/**
	 * 发表帖子
	 * @param post
	 * @return
	 */
	boolean post(Post post);
}
