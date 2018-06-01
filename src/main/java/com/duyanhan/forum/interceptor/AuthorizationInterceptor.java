package com.duyanhan.forum.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.duyanhan.forum.entity.User;

/**
 * 用户认证拦截器，用于拦截未登录状态的用户
 * @author duyanhan
 *
 */
public class AuthorizationInterceptor implements HandlerInterceptor {
	private static final Log logger = LogFactory.getLog(AuthorizationInterceptor.class);

	// 定义哪些请求是不需要被拦截的
	private static final String[] IGNORE_URI = {"/home", "/block", "/login","/register", "/index", "/postList"};
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 先对请求的路径进行判断，看是否需要进行拦截
		String currentRequestURI = request.getRequestURI();
		logger.info("当前请求路径：" + currentRequestURI);
		for (String ignoreURI : IGNORE_URI) {
			if (currentRequestURI.contains(ignoreURI)) {
				logger.info("当前请求路径：" + currentRequestURI + "，由于包含[本该被放行路径:]" + ignoreURI + "，因此直接放行！");
				return true;
			}
		}
		
		User user = (User) request.getSession().getAttribute("currentUser");
		System.out.println(user);
		// 判断用户是否登录
		if (user == null) {
			System.out.println(".....................................");
			// 如果用户没有登录
			logger.info("拦截当前的用户请求：" + currentRequestURI);
			logger.info("请先登录,再执行此操作，即将跳转至登录页面");
			// 重定向至登录页面
			response.sendRedirect(request.getContextPath() + "/loginForm");
			return false;
		}
		// 如果用户已经登录，则验证通过，放行
		logger.info("用户已经登录，放行请求：" + currentRequestURI);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}