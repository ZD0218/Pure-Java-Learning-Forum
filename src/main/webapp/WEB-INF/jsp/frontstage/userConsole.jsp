<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>用户控制台</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- bulma框架样式 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bulma.min.css"
	type="text/css" />
<!-- 我自己的页面样式 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/extra.css" />
<!-- jquery文件 -->
<script src="${pageContext.request.contextPath}/js/jquery3.2.1.min.js"></script>
<!-- 导航栏Js文件 -->
<script src="${pageContext.request.contextPath}/js/navbar.js"></script>
<!-- bulma框架引入的字体样式 -->
<script src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

</head>
<body>
	<!-- 包含导航条 -->
	<jsp:include page="section/navbar.jsp" />
	<div class="container blank_distance">

		<div class="columns">
			<div class="column is-3">
				<div class="box">
					<div class="breadcrumb is-small" aria-label="breadcrumbs">
						<ul>
							<li><a href="${pageContext.request.contextPath }/home">主页</a></li>
							<li class="is-active"><a href="#" aria-current="page">控制台</a></li>
						</ul>
					</div>
				</div>
				<div class="box">
					<aside class="menu">
						<p class="menu-label subtitle is-5">账号信息管理</p>
						<ul class="menu-list">
							<li><a>设置个人信息</a></li>
							<li><a>修改账号密码</a></li>
						</ul>
						<p class="menu-label subtitle is-5">帖子与回复管理</p>
						<ul class="menu-list">
							<li><a>已发帖子管理</a></li>
							<li><a>已发回复管理</a></li>
							<li><a>已收回复管理</a></li>
						</ul>
					</aside>
				</div>
			</div>
			<div class="column is-9">
				<div class="box"></div>
			</div>
		</div>
	</div>
</body>
</html>