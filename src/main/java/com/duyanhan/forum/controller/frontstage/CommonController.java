package com.duyanhan.forum.controller.frontstage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duyanhan.forum.entity.User;

/**
 * 通用控制器
 * @author duyanhan
 *
 */

@Controller
public class CommonController {
	
	// 默认欢迎页
	@RequestMapping(value="/")
	public String index() {
		return  "index";
	}
	
	// 论坛主页
	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}

	// 登录页面
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "loginForm";
	}
	
	// 注册页面
	@RequestMapping(value="/registerForm")
	public String registerForm() {
		return "registerForm";
	}
	
	// 帖子列表页面
	@RequestMapping(value="/postList")
	public String postList() {
		return "postList";
	}
	
	// 帖子页面
	@RequestMapping(value="/post")
	public String post() {
		return "post";
	}
}
