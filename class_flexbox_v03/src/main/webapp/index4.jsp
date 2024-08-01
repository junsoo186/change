<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	display: flex;
	width: 1000px;
	height: 700px;
	background-color: #D86868;
	position: relative;
	justify-content: flex-end;
	margin: 0;
}

.child {
	width: 60px;
	height: 60px;
	position: absolute;
	
	top: 50%;
	margin-top: -25px;
	background-color: white;
	border: 2px solid #333;
}
p{
margin-top: 0px;
}
</style>
</head>
<body>
	<%--
HTML+Java
http://localhost:8080/flex/index.jsp
http://localhost:8080/flex
 --%>

	<div class="container">
		<div class="child">
			<p>item1</p>
		</div>
	</div>


</body>
</html>