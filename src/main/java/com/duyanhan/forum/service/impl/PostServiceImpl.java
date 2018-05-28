package com.duyanhan.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.PostMapper;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostMapper postMapper;
	
	@Override
	public boolean post(Post post) {
		int line = postMapper.insert(post);
		if(line > 0) {
			return true;
		}
		return false;
	}

}
