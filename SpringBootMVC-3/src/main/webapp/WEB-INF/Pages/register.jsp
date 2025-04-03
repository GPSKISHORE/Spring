<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method = "POST">
		<table bgcolor="cyan">
			<tr>
				<th>Details</th>
				<th>Input</th>
			</tr>
			<tr>
				<td>Sno</td>
				<td><input type = "number" name="sno" value="${sno}"/></td>
			</tr>
			<tr>
				<td>Sname</td>
				<td><input type = "text" name="sname"/></td>
			</tr>
			<tr>
				<td>Percent</td>
				<td><input type = "number" name="percent"/></td>
			</tr>
		</table>
		<input type = "submit" value= "Submit"/>
	</form>
</body>
</html>