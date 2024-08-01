<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 결과</title>
</head>
<body>
	<h1>계산 결과</h1>
	<%
		//	폼에서 데이터 추출 
		String first = request.getParameter("num1");
		String second = request.getParameter("num2");
		int a = Integer.parseInt(first);  
		int b = Integer.parseInt(second);  
		// 방어적 코드 작성
		if(first == null || first.trim().isEmpty()){
			out.print("<p> 첫번 째 수가 비었습니다. </p>");
		}else if(second == null || second.trim().isEmpty()){
			out.print("<p> 두번 째 수가 비었습니다. </p>");
		}else{
			
			out.print(a+b);
		}
	
		// 계산에 결과를 스림을 통해 내려주기
	%>
	<a href="calculator.html">돌아가기</a>
</body>
</html>