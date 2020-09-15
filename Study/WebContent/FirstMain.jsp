<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function memberjoin(){
		location.href="http://localhost:8090/Study/MemberJoin.jsp";
	}
	function memberlogin(){
		location.href="http://localhost:8090/Study/MemberLogin.jsp";
	}
</script>
</head>
<body>
	<h2>초기화면</h2>
	<button onclick="memberjoin()">회원가입</button>
	<button onclick="memberlogin()">로그인</button>
</body>
</html>