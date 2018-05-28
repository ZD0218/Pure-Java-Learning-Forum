<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>帖子页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bulma.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/extra.css" />
<!-- include libraries(jQuery, bootstrap) -->
<script src="${pageContext.request.contextPath}/js/jquery3.2.1.min.js"></script>

<!-- include summernote css/js -->
<link
	href="${pageContext.request.contextPath }/plugins/summernote-0.8.10/summernote-lite.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath }/plugins/summernote-0.8.10/summernote-lite.js"></script>

</head>
<body>
	<!-- 包含导航条 -->
	<jsp:include page="section/navbar.jsp" />
	<div class="container blank_distance">
		<div class="box">
			<div id="summernote"></div>
		</div>

	</div>
</body>
<script type="text/javascript">
	function showPostForm() {
		$("#summernote").summernote({
			placeholder : '请在此处填入正文',
			tabsize : 2,
			height : 500
		});
	}
	$(document).ready(function() {
		showPostForm();
	});
</script>
</html>