package com.duyanhan.forum.controller.frontstage;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duyanhan.forum.entity.Block;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.service.BlockService;
import com.duyanhan.forum.service.PostService;

@Controller
public class PostController {
	private static final Log logger = LogFactory.getLog(PostController.class);
	
	@Autowired
	private BlockService blockService;
	@Autowired
	private PostService	postService;

	// 发帖页面
	@RequestMapping(value = "/postForm", method = RequestMethod.GET)
	public String postForm(Model model) {
		Post post = new Post();
		List<Block> blockList = blockService.getBlockListByLevel();
		model.addAttribute("post", post);
		model.addAttribute("blockList", blockList);
		return "postForm";
	}

	// 发表帖子
	@RequestMapping(value = "/post")
	public String post(Post post) {
		System.out.println("hhe ");
		boolean postResult = postService.post(post);
		if(postResult) {
			logger.info("发表成功");
			return "postList";
		}
		else {
			logger.error("发帖失败");
			return "postForm";
		}
	}

	// 展示帖子
	@RequestMapping(value = "/postShow")
	public String postShow() {
		return "postShow";
	}
}
