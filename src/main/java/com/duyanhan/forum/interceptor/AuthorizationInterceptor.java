package com.duyanhan.forum.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.duyanhan.forum.entity.User;

/**
 * 用户认证拦截器，用于拦截未登录状态的用户
 * @author duyanhan
 *
 */
public class AuthorizationInterceptor implements HandlerInterceptor {

	// 定义哪些请求是不需要被拦截的
	private static final String[] IGNORE_URI = {"/home", "/register", "/",
			"/blockTitleList","/blockPageList"
			};
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 先对请求的路径进行判断，看是否需要进行拦截
		boolean flag = false;
		String currentRequestURI = request.getRequestURI();
		for (String ignoreURI : IGNORE_URI) {
			if (currentRequestURI.contains(ignoreURI)) {
				flag = true;
				break;
			}
		}
		
		// 根据flag是否拦截请求
		if (!flag) {
			// 获取session中的用户信息
			User user = (User) request.getSession().getAttribute("currentUser");
			// 判断用户是否登录
			if (user == null) {
				System.out.println(".....................................");
				// 如果用户没有登录
				System.out.println("拦截当前的请求：" + currentRequestURI);
				System.out.println("请先登录,再执行此操作");
				// 请求转发
				request.getRequestDispatcher("loginForm").forward(request, response);
			} else {
				// 如果用户已经登录，则验证通过，放行
				System.out.println("用户已经登录，放行请求：" + currentRequestURI);
				flag = true;
			}
		}
		
		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}