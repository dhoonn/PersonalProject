<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
  background-color: white;
  padding: 20px;
}

.topnav a {
	float: left;
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
  color: black;
  border-radius: 40px;
}

.topnav a.active {
  background-color: black;
  border-radius: 40px;
	color: white;
}



.topnav input[type=text] {
	padding: 6px;
	margin-top: 8px;
	font-size: 17px;
	border: none;
}

.topnav .search-container button {
	padding: 6px 10px;
	margin-top: 8px;
	margin-right: 16px;
	background: #ddd;
	font-size: 17px;
	border: none;
	cursor: pointer;
}

.topnav .search-container button:hover {
	background: #ccc;
}

@media screen and (max-width: 600px) {
	.topnav .search-container {
    float: none;
    
	}
	.topnav a, .topnav input[type=text], .topnav .search-container button {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
 img {
      border-radius: 20px;

    }
    
      #columns {
      column-width: 252px;
      column-gap: 15px;
      padding: 40px;
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
</style>

</head>
<body>

	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="#about">About</a> <a
      href="#contact">Contact</a>
      
		<div class="search-container">
			<form action="/action_page.php">
				<input type="text" placeholder="Search.." name="search" style="width: 60%; float: left;" autocapitalize="off" autocomplete="off">
				<button type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
	</div>
<div id="columns">
    <figure>
      <img src="/images/1.jpg">
    </figure>
    <figure>
      <img src="/images/2.jpg">
    </figure>
    <figure>
      <img src="/images/3.jpg">
    </figure>
    <figure>
      <img src="/images/4.jpg">
    </figure>
    <figure>
      <img src="/images/5.jpg">
    </figure>
    <figure>
      <img src="/images/6.jpg">
    </figure>
    <figure>
      <img src="/images/7.jpg">
    </figure>
    <figure>
      <img src="/images/8.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/6.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/6.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/9.jpg">
    </figure>
    <figure>
      <img src="/images/12.jpg">
    </figure>
    <figure>
      <img src="/images/검술명가 막내아들2.jpg">
    </figure>
    <figure>
      <img src="/images/신의탑.jpg">
    </figure>
    <figure>
      <img src="/images/전생검신.jpg">
    </figure>
    <figure>
      <img src="/images/호랑이형님.jpg">
    </figure>
    <figure>
      <img src="/images/13.png">
    </figure>

  </div>

</body>
</html>
