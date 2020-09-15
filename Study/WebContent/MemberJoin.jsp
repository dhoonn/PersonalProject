<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
     <script>
        function pwdeqFn() {
            console.log("pwdEq 함수 호출");
            var pwd = document.getElementById("mpassword").value;
            var pwdch = document.getElementById("mpasswordch").value;
            var eqMsg = document.getElementById("pwdEq");
            if (pwd == pwdch) {
                console.log('비밀번호 일치');
                // document.getElementById("pwdEq").style.color = "green";
                // document.getElementById("pwdEq").innerHTML="비밀번호가 일치합니다.";
                eqMsg.innerHTML = "비밀번호가 일치합니다.";
                eqMsg.style.color = "green";
            } else {
                console.log('비밀번호 불일치');
                // document.getElementById("pwdEq").style.color = "red";
                // document.getElementById("pwdEq").innerHTML="비밀번호가 다릅니다.";
                eqMsg.innerHTML = "비밀번호가 다릅니다.";
                eqMsg.style.color = "red";
            }
        }

/*         function pwdCheck() {
            //비밀번호 검증을 위한 정규식
            var exp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,16}$/;
            var pwd = document.getElementById("mpassword").value;
            var pwdch = document.getElementById("pwdch");
            if (pwd.match(exp)) {
                pwdch.style.color = "green";
                pwdch.innerHTML = "비밀번호 형식 맞음";
            } else {
                pwdch.style.color = "red";
                pwdch.innerHTML = "비밀번호 형식 틀림";
            }
        }*/    
        </script>
</head>
<body>
 <div id="main" class="sign">
 
	<form action="memberjoin" method="post">
	    아이디<br>
            <input type="text" name="mid" id="mid" placeholder="아이디를 입력하세요" maxlength="20" size="50px" >
            <p></p>
            비밀번호<br>
            <input type="text" name="mpassword" id="mpassword" maxlength="20" placeholder="비밀번호를 입력하세요" size="50px"onkeyup="pwdCheck()"><br>
            <span id="pwdch"></span><br>
            비밀번호 재확인<br>
            <input type="text" id="mpasswordch" name="mpasswordch" onkeyup="pwdeqFn()"size="50px">
            <span id="pwdEq"></span><br>
            <p></p>
            이름<br>
            <input type="text" name="mname" id="mname" placeholder="이름을 입력하세요"size="50px"><br>
            <p></p>
            성별<br>
		<input type="radio" name="mgender" id="mgender" value="male">남자
        <input type="radio" name="mgender" id="mgender" value="female">여자<br>
            생년월일<br>
            <input type="date" name="mbirth" id="mbirth"><br>
            <p></p>
            이메일<br>
            <input type="text" name="memail" id="memail" placeholder="이메일을 입력하세요">
            <p></p>
            휴대전화<br>
            <input type="text" name="mphone" id="mphone" placeholder="휴대폰 번호를 입력하세요" size="50px"onkeyup="phoneCheck()" onblur="disapper()"><br>
            <p></p>
         <input type="submit" value="가입하기">
	</form>
</div>
</body>
</html>