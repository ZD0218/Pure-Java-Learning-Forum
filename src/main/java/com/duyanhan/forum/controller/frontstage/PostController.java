package com.duyanhan.forum.controller.frontstage;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.duyanhan.forum.entity.Block;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.User;
import com.duyanhan.forum.service.BlockService;
import com.duyanhan.forum.service.PostService;

@Controller
@SessionAttributes(value= {"currentUser"}, types= {com.duyanhan.forum.entity.User.class})
public class PostController {
	private static final Log logger = LogFactory.getLog(PostController.class);
	
	@Autowired
	private BlockService blockService;
	@Autowired
	private PostService	postService;

	// 发帖页面
	@RequestMapping(value = "/postForm")
	public String postForm(@ModelAttribute("currentUser") User currentUser, Model model) {
		Post post = new Post();
		post.setUserId(currentUser.getId());
		List<Block> blockList = blockService.getBlockListByLevel();
		model.addAttribute("post", post);
		model.addAttribute("blockList", blockList);
		return "postForm";
	}

	// 发表帖子
	@RequestMapping(value = "/post")
	public String post(Post post) {
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
	
	// 展示帖子列表
	@RequestMapping(value = "/postList/{blockId}")
	public String postList(@PathVariable Integer blockId, Model model) {
		// 将blockId 保存到request域中
		model.addAttribute("currentBlockId", blockId);
		return "postList";
	}

	// 展示帖子
	@RequestMapping(value = "/postShow")
	public String postShow() {
		return "postShow";
	}
}
