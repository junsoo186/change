<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ include file="header.jsp"%>
<body2>
	<div class="container">
		<h2>cm 를 인치로 변환</h2>
		<form action="result.jsp" method="POST">
			<label for="cm">cm<br></label>
			<input type="number" id="num1" name="num1" required="required">
			<br>
			<br>
			<input type="submit" value="변환">
		</form>
		
	</div>
<body2>
	<style>
.container {
		display: flex;
		background-color: white;
		height:300px;
		width:500px;
		padding: 20px;
		border-radius: 8px; 
		box-shadow: 0 0 10px rgba(0,0,0, 0.4);
		 align-items: center;
		 justify-content:center;
		 flex-direction: column;
		 
		
	}
	body2{
		display: flex;
		height: 100vh;
		justify-content: center;
		align-items: center;
		margin: 0;
		background-color: #f0f0f0;
		}
			input[type="submit"] {
		width: 260px;
		height: 35px;
		border-radius: 4px; 
		background-color: gray;
	}
	
	input[type="number"] {
		margin-top:6px;
		width: 260px;
		height: 25px;
		border-radius: 4px; 
		border-color: rgba(0,0,0, 0.3);
	}
		
	
</style>
<%@ include file="footer.jsp"%>