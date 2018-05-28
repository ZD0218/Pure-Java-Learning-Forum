<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<input class="input is-black" type="text" placeholder="请在此处填入标题">
			<hr>
			<div id="summernote"></div>
			<hr>
			<div class="select">
				<select class="is-hovered">
					<option>选择发帖版块：</option>
					<option>With options</option>
				</select>
			</div>
			<input class="button is-black" type="submit" value="&nbsp;&nbsp;&nbsp;&nbsp;开始发帖&nbsp;&nbsp;&nbsp;&nbsp;">
		</div>

	</div>
</body>
<script type="text/javascript">
	function showPostForm() {
		$("#summernote").summernote({
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