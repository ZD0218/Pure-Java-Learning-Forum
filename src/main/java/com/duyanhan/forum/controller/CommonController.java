package com.duyanhan.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duyanhan.forum.domain.UserInfo;

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
		return "home2";
	}

	// 登录页面
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm(Model model) {
		UserInfo userInfo = new UserInfo();
		model.addAttribute("userInfo", userInfo);
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
}
