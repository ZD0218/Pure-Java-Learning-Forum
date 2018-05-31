package com.duyanhan.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.CommentMapper;
import com.duyanhan.forum.entity.Comment;
import com.duyanhan.forum.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public boolean comment(Comment comment) {
		int line = commentMapper.insert(comment);
		if(line > 0) {
			return true;
		}
		return false;
	}

}
