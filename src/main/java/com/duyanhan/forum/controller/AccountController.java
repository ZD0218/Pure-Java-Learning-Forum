package com.duyanhan.forum.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.duyanhan.forum.domain.UserInfo;
import com.duyanhan.forum.service.UserService;

@Controller
@RequestMapping(value = "/user")
@SessionAttributes("currentUser")
public class AccountController {

	private static final Log logger = LogFactory.getLog(AccountController.class);
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login")
	public String login(
			UserInfo userInfo,
			Model model) {
		// 获取登录返回结果
		boolean loginResult = userService.login(userInfo);
		System.out.println("1");
		// 如果登录成功
		if (loginResult) {
			System.out.println("2");
			logger.info("登录成功,没有放入model");
			// 向前台传入当前用户名
			model.addAttribute("currentUser", userInfo.getUsername());
		}
		else {
			System.out.println("3");
			logger.error("登录失败，查无此人");
		}
		return "home";
	}

	@RequestMapping(value = "/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "home";
	}
}
