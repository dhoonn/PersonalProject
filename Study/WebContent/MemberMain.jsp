<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>메인페이지 입니다 :)</h2>
	${sessionScope.loginId} 님 환영합니다. <br>
	
	<c:if test="${sessionScope.loginId eq 'admin' }">
	<h4>관리자이십니다 :)</h4>
	<a href="memberlist">관리자모드(회원목록)</a><br>
	</c:if>
	
	<a href="memberview">마이페이지</a>
</body>
</html>