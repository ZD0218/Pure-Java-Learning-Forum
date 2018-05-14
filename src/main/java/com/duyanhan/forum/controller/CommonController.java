package com.duyanhan.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping(value="/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	// 注册页面
	@RequestMapping(value="/registerForm")
	public String registerForm() {
		return "registerForm";
	}
}
