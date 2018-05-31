package com.duyanhan.forum.controller.frontstage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.service.CommentService;
import com.duyanhan.forum.service.PostService;

@Controller
public class CommentController {
	private static final Log logger = LogFactory.getLog(CommentController.class);
	
	@Autowired
	private CommentService CommentService;
	@Autowired
	private PostService	postService;
	// 发帖页面
	@RequestMapping(value = "/commentForm/{postId}")
	public String CommentForm(@PathVariable Integer postId, Model model) {
		Post currentPost = postService.getPostByPostId(postId);
		model.addAttribute("currentPost", currentPost);
		return "commentForm";
	}

}
