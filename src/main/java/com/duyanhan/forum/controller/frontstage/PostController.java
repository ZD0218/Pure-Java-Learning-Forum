package com.duyanhan.forum.controller.frontstage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duyanhan.forum.entity.Block;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.service.BlockService;

@Controller
public class PostController {

	@Autowired
	private BlockService blockService;

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
	public String post() {
		return "post";
	}

	// 展示帖子
	@RequestMapping(value = "/postShow")
	public String postShow() {
		return "postShow";
	}
}
