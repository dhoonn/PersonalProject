<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />
<style>
body {
	/* margin: 0; */
	/* font-size: 28px; */
	font-family: Arial, Helvetica, sans-serif;
}

#navbar {
	overflow: hidden;
	/* background-color: white; */
	padding: 20px;
}

#navbar a {
	float: left;
	display: block;
	/* color: black; */
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 20px;
	border: none;
}

#navbar a:hover {
	/* background-color: #ddd; */
	/* color: black; */
	/* border-radius: 40px; */
	
}

#navbar a.active {
	/* background-color: black; */
	/* border-radius: 40px; */
	color: white;
}

.sticky {
	position: fixed;
	top: 0;
	width: 100%;
}

.sticky+.content {
	padding-top: 60px;
}

img {
	border-radius: 20px;
}

#columns {
	column-width: 252px;
	column-gap: 15px;
	padding: 40px;
	padding-top: 10%;
}

#columns figure {
	display: inline-block;
	border: none;
	margin: 0;
	margin-bottom: 15px;
	padding: 3px;
}

#columns figure img {
	width: 100%;
}

#columns figure figcaption {
	padding: 10px;
	margin-top: 11px;
}

#search input {
	
}
li{
	float:left;
	list-style:none;
}
#search {
	background-image: url(images/search-icon.png);
	background-position: 5px center;
	padding-left: 40px;
	/* border: 1px solid #2e3238; */
	width: 100%;
	height: 30px;
	box-sizing: border-box;
	outline: none;
	background-repeat: no-repeat;
	font-size: 20px;
}
#searchbar{
	padding:10px;
}
</style>
</head>

<body>



	<div id="navbar">
		<ul>
			<li><a class="active" id="test" href="boardmain">Home</a></li>
			<li><a href="javascript:void(0)">Follow</a></li>
			<li class="searchbar"><div class="search-container">

					<form action="/action_page.php">
						<input type="text" placeholder="Search.." name="search"
							id="search" style="width: 65%; border-radius: 10px;"
							autocapitalize="off" autocomplete="off">
					</form>
				</div></li>
			<li><a href="javascript:void(0)">Follow</a></li>
			<li><a href="javascript:void(0)">Follow</a></li>
		</ul>

	</div>
	<!-- <div class="header">
		<h2>Scroll Down</h2>
		<p>Scroll down to see the sticky effect.</p>
	</div> -->
	<%-- <c:forEach var="board" items="${boardList}"> --%>
	<div id="columns">
		<figure>
			<img src="images/1.jpg">
		</figure>
		<figure>
			<img src="images/2.jpg">
		</figure>
		<figure>
			<img src="images/thumbs/01.jpg">
		</figure>
		<figure>
			<img src="images/4.jpg">
		</figure>
		<figure>
			<img src="images/5.jpg">
		</figure>
		<figure>
			<img src="images/6.jpg">
		</figure>
		<figure>
			<img src="images/7.jpg">
		</figure>
		<figure>
			<img src="images/8.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/6.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/6.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/9.jpg">
		</figure>
		<figure>
			<img src="images/12.jpg">
		</figure>
		<figure>
			<img src="images/검술명가 막내아들2.jpg">
		</figure>
		<figure>
			<img src="images/신의탑.jpg">
		</figure>
		<figure>
			<img src="images/전생검신.jpg">
		</figure>
		<figure>
			<img src="images/호랑이형님.jpg">
		</figure>
		<figure>
			<img src="images/13.png">
		</figure>
		<figure>${board.bfile}
		</figure>
	</div>
	<%-- </c:forEach> --%>


	<script>
		window.onscroll = function() {
			myFunction()
		};

		var navbar = document.getElementById("navbar");
		var sticky = navbar.offsetTop;

		function myFunction() {
			if (window.pageYOffset >= sticky) {
				navbar.classList.add("sticky")
			} else {
				navbar.classList.remove("sticky");
			}
		}
	</script>

</body>

</html>