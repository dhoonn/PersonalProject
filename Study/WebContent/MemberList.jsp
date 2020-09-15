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
<h2>MemberList.jsp</h2>
	<!-- jstl에서 제공하는 반복 태그를 이용하여 memberList에 담긴 값 출력 -->

	
	<!-- 데이터를 표에 출력 -->
	<table border="1">
	<tr>
		<th>아이디</th> <th>비밀번호</th> <th>이름</th>
		<th>생년월일</th><th>전화번호</th> <th>이메일</th> 
		<th>성별</th>
		<c:forEach var="member" items="${memberList}">
			<tr>
			<td>${member.mid}</td>
			<td>${member.mpassword}</td>
			<td>${member.mname}</td>
			<td>${member.mbirth}</td>
			<td>${member.mphone}</td>
			<td>${member.memail}</td>
			<td>${member.mgender}</td>
			</tr><br>
		</c:forEach>

</body>
</html>