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
				<!-- 包含侧边菜单栏 -->
				<jsp:include page="section/asideMenu.jsp" />
			</div>
			<div class="column is-9">
				<div class="box">修改账号密码</div>
				<div class="box">
					<div class="field">
						<label class="label">原密码</label>
						<div class="control">
							<input class="input" type="text" placeholder="用户昵称">
						</div>
					</div>
					<div class="field">
						<label class="label">新密码</label>
						<div class="control">
							<input class="input" type="text" placeholder="用户昵称">
						</div>
					</div>
					<div class="field">
						<label class="label">重复密码</label>
						<div class="control">
							<input class="input" type="text" placeholder="用户昵称">
						</div>
					</div>

					<div class="field is-grouped">
						<div class="control">
							<button class="button is-link">更新设置</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>