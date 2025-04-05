<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="styleSheet" href = "TodoStyle.css"/>
<style>
#h{
	position :center;
	text-align: center;
	font-size:25px;
	font-weight:storng;
	font-family: serif;
	color:maroon;
	font-style:underline;
	text-decoration:underline;
}
#fom, #sname{
	font-size:20px;
	font-weight:strong;
	font-coloe:black;	
	text-decoration:none;
	text-align:center;
	border-color:black;
	margin:50px;
}
#sub{
	border-width:2px;
	border-height:2px;
	margin-width:200px;
	margin-height:200px;
	padding-width:200px;
	padding-height:200px;
	height:30px;
	width:200px;
	border-radius:10px;
	background-color:yellowGreen;
	font-weight:strong;
	text-color:black;
	font-size:15px;
	margin-top:20px;
	text-align:center;
}

</style>
</head>
<body>
	<h2 id="h">Welcome Come to Shiva ToDo List</h2>
	<form action="ToDo" method = "GET" id="fom">
		Please Enter Your Name : <input type = "text" name = "sname" id="sname" value="Kishore"/><br>
		<input type = "submit" id = "sub" value = "Click Here for ToDoList">	
	</form>
	
</body>
</html>