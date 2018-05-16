package com.duyanhan.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.duyanhan.forum.domain.UserInfo;

@Controller
@RequestMapping(value="/user")
@SessionAttributes("currentUser")
public class AccountController {

	@RequestMapping(value="/login")
	public String login(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			Model model) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		model.addAttribute("currentUser", userInfo);
		return "home";
	}
	
	@RequestMapping(value="/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "home";
	}
}
