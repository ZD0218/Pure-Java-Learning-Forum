package com.duyanhan.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duyanhan.forum.domain.UserInfo;

@Controller
@RequestMapping(value="/user")
public class AccountController {

	@RequestMapping(value="/login")
	public String login(
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		return "home";
	}
}
