package com.duyanhan.forum.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duyanhan.forum.entity.User;
import com.duyanhan.forum.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class AccountController {
	private static final Log logger = LogFactory.getLog(AccountController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login")
	public String login(
			User user,
			HttpSession session,
			Model model) {
		// 获取登录返回结果
		boolean loginResult = userService.login(user);
		// 如果登录成功
		if (loginResult) {
			// 向前台传入当前用户名
			session.setAttribute("currentUser", user.getUsername());
			logger.info("用户{"+user.getUsername()+"}登录成功，用户名存入session");
		}
		else {
			logger.error("用户{"+user.getUsername()+"}登录失败，数据库查无此人");
		}
		return "home";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		String currentUser = (String) session.getAttribute("currentUser");
		session.removeAttribute("currentUser");
		logger.info("用户{"+currentUser+"}注销成功");
		return "home";
	}
}
