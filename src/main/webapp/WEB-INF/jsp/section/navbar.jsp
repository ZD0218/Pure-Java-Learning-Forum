<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<nav class="navbar is-fixed-top">
		<div class="bd-special-shadow"
			style="opacity: 1; transform: scaleY(1);"></div>
		<div class="container">
			<div class="navbar-brand">
				<!-- 设置欢迎页 -->
				<a class="navbar-item" href="${pageContext.request.contextPath}/">
					<img src="${pageContext.request.contextPath}/images/LOGO.png"
					alt="Bulma: a modern CSS framework based on Flexbox" width="151"
					height="28">
				</a>
				<div class="navbar-burger burger"
					data-target="navbarExampleTransparentExample">
					<span></span> <span></span> <span></span>
				</div>
			</div>
			<div id="navbarExampleTransparentExample" class="navbar-menu">
				<div class="navbar-start">
					<!-- 设置主页跳转 -->
					<a class="navbar-item"
						href="${pageContext.request.contextPath}/home"> 主页 </a>
					<div class="navbar-item has-dropdown is-hoverable">
						<a class="navbar-link" href="/documentation/overview/start/">
							版块导航 </a>
						<div class="navbar-dropdown is-boxed">
							<a class="navbar-item" href="/documentation/overview/start/">
								即时问答版块 </a>
							<hr class="navbar-divider">
							<a class="navbar-item"
								href="https://bulma.io/documentation/modifiers/syntax/">
								语言基础版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/columns/basics/">
								面向对象版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/layout/container/">
								集合版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/form/general/"> 泛型版块 </a> <a
								class="navbar-item"
								href="https://bulma.io/documentation/elements/box/"> 常用类库版块
							</a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								异常处理版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								AWT编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								Swing编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								JDBC编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								注解编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								输入/输出编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								多线程编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								网络编程版块 </a> <a class="navbar-item"
								href="https://bulma.io/documentation/components/breadcrumb/">
								类加载/反射编程版块 </a>
						</div>
					</div>
				</div>

				<div class="navbar-end">
					<div class="navbar-item">
						<div class="field has-addons">
							<p class="control">
								<span class="select"> <select>
										<option>帖子</option>
										<option>作者</option>
								</select>
								</span>
							</p>
							<p class="control is-expanded">
								<input class="input" type="text" placeholder="搜索您感兴趣的内容">
							</p>
							<p class="control">
								<a class="button"> <span class="is-icon is-small"> <i
										class="fab fa-sistrix"></i>
								</span>
								</a>
							</p>
						</div>
					</div>
					<!-- 当用户没有登录的时候 -->
					<c:if test="${empty userInfo }">
						<div class="navbar-item">
							<!-- 登录页面跳转按钮 -->
							<a href="${pageContext.request.contextPath}/loginForm"> <span
								class="button is-inverted is-info">登陆</span></a> <b
								class="has-text-grey-light">|</b>
							<!-- 注册页面跳转按钮 -->
							<a href="${pageContext.request.contextPath}/registerForm"> <span
								class="button is-inverted is-success">注册</span></a>
						</div>
					</c:if>
					<!-- 当用户登录之后 -->
					<c:if test="${!empty userInfo }">
						<div class="navbar-item has-dropdown is-hoverable">
							<a class="navbar-link" href="/documentation/overview/start/">${userInfo.username }</a>
							<div class="navbar-dropdown is-boxed">
								<a class="navbar-item" href="https://bulma.io/documentation/modifiers/syntax/">设置个人信息 </a> 
								<a class="navbar-item" href="https://bulma.io/documentation/columns/basics/">修改密码</a>
								<hr class="navbar-divider">
								<a class="navbar-item" href="/documentation/overview/start/">帖子与回复管理</a>
								<hr class="navbar-divider">
								<a class="navbar-item" href="/documentation/overview/start/">注销账号 </a>
							</div>
						</div>
					</c:if>
				</div>
			</div>
		</div>
	</nav>