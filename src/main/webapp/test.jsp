<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1111
<form action="/salary/findSal" method="get">
	<input name="empId">
	<input name="year">
	<input name="month">
	<input type="submit">
</form>


${sal }
</body>
</html>