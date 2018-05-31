package com.duyanhan.forum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.CommentMapper;
import com.duyanhan.forum.dto.QueryPage;
import com.duyanhan.forum.dto.QueryPageWithPostId;
import com.duyanhan.forum.entity.Comment;
import com.duyanhan.forum.entity.CommentExample;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.PostExample;
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

	@Override
	public List<Comment> getCommentListByQueryPageWithPostId(QueryPageWithPostId queryPageWithPostId) {
		Integer postId = queryPageWithPostId.getPostId();
		QueryPage queryPage = queryPageWithPostId.getQueryPage();
		CommentExample commentExample = new CommentExample();
		// 分页查询
		commentExample.page(queryPage.getPage(), queryPage.getPageSize());
		// 按版块ID查询
		commentExample.createCriteria().andPostIdEqualTo(postId);
		List<Comment> commentList = commentMapper.selectByExampleWithBLOBs(commentExample);
		return commentList;
	}

}
