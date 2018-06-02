package com.duyanhan.forum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.PostMapper;
import com.duyanhan.forum.dto.PostListAndTotalPostNumber;
import com.duyanhan.forum.dto.QueryPage;
import com.duyanhan.forum.dto.QueryPageWithBlockId;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.PostExample;
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

	@Override
	public PostListAndTotalPostNumber getPostListAndTotalPostNumberByQueryPageWithBlockId(QueryPageWithBlockId queryPageWithBlockId) {
		Integer blockId = queryPageWithBlockId.getBlockId();
		QueryPage queryPage = queryPageWithBlockId.getQueryPage();
		PostExample postExample = new PostExample();
		// 分页查询
		postExample.page(queryPage.getPage(), queryPage.getPageSize());
		// 按版块ID查询
		postExample.createCriteria().andBlockIdEqualTo(blockId);
		// 当前页面的帖子列表
		List<Post> postList = postMapper.selectByExampleWithBLOBs(postExample);
		// 总帖子数
		Integer totalPostNumber = (int) postMapper.countByExample(postExample);
		PostListAndTotalPostNumber postListAndTotalPostNumber = new PostListAndTotalPostNumber(postList, totalPostNumber);
		return postListAndTotalPostNumber;
	}

	@Override
	public Post getPostByPostId(Integer postId) {
		Post post = postMapper.selectByPrimaryKey(postId);
		return post;
	}

}
