<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="EmpEnty">
	<table>
		<tr>
		EMP Name : <form:input path="EName"/>
		</tr>
		<tr>
			Salary :<form:input path="sal"/>
		</tr>
		<tr>
		Designation : <form:input path="designation"/>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"></td>
		</tr>
	</table>
</form:form>
</body>
</html>