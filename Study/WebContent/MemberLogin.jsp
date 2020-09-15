<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function login(){
		loginform.submit();
	}
	
</script>
</head>
<body>
	 <div id="main">
	 <form action="login" method="post" name="loginform">
        <h1>Login</h1>
        <input type="text" name="mid" id="mid" placeholder="아이디" maxlength="20" size="50px"  >
        <p></p>
        <input type="text" name="mpassword" id="mpassword" placeholder="비밀번호" maxlength="20" size="50px" >
        <p></p>
        <button id="btn" onclick="login()">로그인</button>
        <p></p>
        
 
	 </form>
    </div>
</body>
</html>