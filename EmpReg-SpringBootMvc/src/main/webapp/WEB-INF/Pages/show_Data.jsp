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
<form:form modelAttribute="EmpEnty" path="*">
<p style="color:red;text-align:center">


</p>
	<table>
		<tr>
		<td>EMP Name : <form:input path="EName"/><form:errors path="eName"></form:errors></td>
		</tr>
		<tr>
			<td>Salary :<form:input path="sal"/><form:errors path="sal"></form:errors></td>
		</tr>
		<tr>
		<td>Designation : <form:input path="designation"/><form:errors path="designation"></form:errors></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"></td>
		</tr>
	</table>
</form:form>
</body>
</html>