<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	th{
	font-size:25px;
	font-weight:storng;
	font-family: serif;
	color:maroon;
	text-decoration:underline;
}
.tb, body{
	text-align:center;
}
table,th,td{
	text-align:center;
	margin-left:auto;
	margin-right:auto;
	boder-width:20px;
	border-height:20px;
	boder-color:red;
	border-style:solid;
	 border-collapse: collapse;
}
#sno,#tsk{
	boder-width:0px;
	border-height:0px;
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
#sname{
display:none;
}
</style>
</head>
<body>
	<h1>Dear ${param.sname},Site is under Construction</h1>
	<form action = "ToDoInsrt" method = "GET" id = "fom">
	<input type="text" value=${param.sname} id="sname" name="sname">
	<table>
		<tr>
			<th>TaskNumber</th>
			<th>TaskDetails</th>
		</tr>
		<tr>
			<td><input type="number" id="sno" name = "sno"/></td>
			<td><input type="text" id = "tsk" name = "tsk"/></td>
		</tr>
	</table>
	<input type = "submit" id = "sub" value = "Click Here for ToDoList">	
	</form>
</body>
</html>