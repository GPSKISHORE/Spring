<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method = "POST" modelAttribute="student">
		<table bgcolor="cyan">
			<tr>
				<th>Details</th>
				<th>Input</th>
			</tr>
			<tr>
				<td>Sno</td>
				<td><form:input path="sno"/></td>
			</tr>
			<tr>
				<td>Sname</td>
				<td><form:input path = "sname"/></td>
			</tr>
			<tr>
				<td>Percent</td>
				<td><form:input path = "percent"/></td>
			</tr>
		</table>
		<input type = "submit" value= "Submit"/>
	</form:form>
</body>
</html>