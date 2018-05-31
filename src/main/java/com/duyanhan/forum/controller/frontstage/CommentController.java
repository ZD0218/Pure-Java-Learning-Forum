package com.duyanhan.forum.controller.frontstage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.duyanhan.forum.entity.Comment;
import com.duyanhan.forum.entity.Post;
import com.duyanhan.forum.entity.User;
import com.duyanhan.forum.service.CommentService;
import com.duyanhan.forum.service.PostService;

@Controller
@SessionAttributes(value= {"currentUser"}, types= {com.duyanhan.forum.entity.User.class})
public class CommentController {
	private static final Log logger = LogFactory.getLog(CommentController.class);
	
	@Autowired
	private CommentService commentService;
	@Autowired
	private PostService	postService;
	// 回帖表单页面
	@RequestMapping(value = "/commentForm/{postId}")
	public String CommentForm(@ModelAttribute("currentUser") User currentUser, @PathVariable Integer postId, Model model) {
		Post currentPost = postService.getPostByPostId(postId);
		model.addAttribute("currentPost", currentPost);
		Comment comment = new Comment();
		comment.setPostId(postId);
		comment.setUserId(currentUser.getId());
		model.addAttribute("comment", comment);
		return "commentForm";
	}

	// 回帖
	@RequestMapping(value = "/comment")
	public String CommentForm(@ModelAttribute Comment comment) {
		boolean commentResult = commentService.comment(comment);
		if(commentResult) {
			logger.info("回帖成功");
			return "home";
		}
		else {
			logger.error("回帖失败");
			return "commentForm";
		}
		
	}
}
