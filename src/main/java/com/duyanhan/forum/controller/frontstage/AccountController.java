package com.duyanhan.forum.controller.frontstage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.duyanhan.forum.entity.User;
import com.duyanhan.forum.service.UserService;

@Controller
@RequestMapping(value= "/user")
@SessionAttributes(value= {"currentUser"}, types= {com.duyanhan.forum.entity.User.class})
public class AccountController {
	private static final Log logger = LogFactory.getLog(AccountController.class);
	
	@Autowired
	private UserService userService;

	// 用户登录
	@RequestMapping(value = "/login")
	public String  login(User user, Model model) {
		// 获取登录返回结果
		boolean loginResult = userService.login(user);
		User currentUser = userService.getUserByUsernameAndPassword(user);
		if (loginResult) {
			// 登录成功
			model.addAttribute("currentUser", currentUser);
			logger.info("用户{"+currentUser.getUsername()+"}登录成功，用户存入session");
			return "home";
		}
		else {
			// 登录失败
			logger.error("用户{"+currentUser.getUsername()+"}登录失败，数据库查无此人");
			return "loginForm";
		}
	}

	// 用户注册
	@RequestMapping(value = "/register")
	public String register(User user) {
		// 获取注册返回结果
		boolean registerResult = userService.register(user);
		if (registerResult) {
			// 注册成功
			logger.info("用户{"+user.getUsername()+"}注册成功");
			return "loginForm";
		}
		else {
			// 注册成功
			logger.info("用户{"+user.getUsername()+"}注册失败");
			return "registerForm";
		}
	}
	
	// 用户注销
	@RequestMapping(value = "/logout")
	public String logout(@ModelAttribute("currentUser") User currentUser, SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		logger.info("用户{"+currentUser.getUsername()+"}注销成功");
		return "home";
	}
}
