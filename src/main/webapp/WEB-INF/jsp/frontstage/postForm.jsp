<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>发表帖子</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- bulma框架样式 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bulma.min.css" type="text/css" />
<!-- 我自己的页面样式 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/extra.css" />
<!-- jquery文件 -->
<script src="${pageContext.request.contextPath}/js/jquery3.2.1.min.js"></script>
<!-- 导航栏Js文件 -->
<script src="${pageContext.request.contextPath}/js/navbar.js"></script>
<!-- bulma框架引入的字体样式 -->
<script src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
<!-- summernote插件的css/js文件 -->
<link href="${pageContext.request.contextPath }/plugins/summernote-0.8.10/summernote-lite.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/plugins/summernote-0.8.10/summernote-lite.js"></script>

</head>
<body>
	<!-- 包含导航条 -->
	<jsp:include page="section/navbar.jsp" />
	<div class="container blank_distance">
		<div class="box">
			<form:form modelAttribute="post" method="post" action="${pageContext.request.contextPath }/post">
				<!-- 帖子标题 -->
				<form:input path="title" cssClass="input is-dark" type="text" placeholder="请在此处填入标题"/>
				<hr>
				<!-- 帖子内容 -->
				<form:input path="content" type="text"/>
				<hr>
				<!-- 发帖版块 -->
				<div class="select">
					<form:select path="blockId" cssClass="is-hovered">
						<option>选择发帖版块：</option>
						<form:options items="${blockList }" itemLabel="title" itemValue="id"/>
					</form:select>
				</div>
				<!-- 发帖人-->
				<form:input path="userId" type="hidden"/>
				<!-- 发帖时间 -->
				<form:input path="posttime" type="date"/>
				<!-- 更新时间 -->
				<form:input path="updatetime" type="date"/>
				<!-- 提交按钮 -->
				<input class="button is-black" type="submit" value="&nbsp;&nbsp;&nbsp;&nbsp;开始发帖&nbsp;&nbsp;&nbsp;&nbsp;">
			</form:form>
		</div>

	</div>
</body>
<script type="text/javascript">
	function showPostForm() {
		$("#content").summernote({
			placeholder : '请在此处填入正文',
			tabsize : 4,
			height : 500,
			disableResizeEditor: true
		});
	}
	$(document).ready(function() {
		showPostForm();
	});
</script>
</html>