<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
	<div class=sum>
		<h2>변환 결과</h2>
			<%
			String first = request.getParameter("num1");
			int a = Integer.parseInt(first);
			out.print(a/0.39+"인치");
			%>
	</div>

<%@ include file="footer.jsp"%>
<style>
.sum{
		display: flex;
		height: 100vh;
		justify-content: center;
		align-items: center;
		margin: 0;
		background-color: #f0f0f0;
		}
</style>