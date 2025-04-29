<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
th,td,table{
	border:3px solid;
	text-align:center;
	margin:auto;
}
#sd{
	text-align:center;
	color:red;
	font-size: 30px;
	margin:auto;	
	display:block;
	border-radius:10px;
	margin-top:10px;
	background-color:yellowgreen;
}
</style>
</head>
<body>
	<form:form modelAttribute="enty" path="*">
		<c:if test="${!empty enty}">
			<table border="1">
			<tr>
				<td>Emp No</td>
				<td>${enty.emoNum}</td>
			</tr>
			<tr>
				<td>Emp Name</td>
				<td><form:input path="EName"/></td>
			</tr>
			<tr>
				<td>Sal</td>
				<td><form:input path="sal"/></td>
			</tr>	
			<tr>
				<td>designation</td>
				<td><form:input path="designation"/></td>
			</tr>	
			</table>
		</c:if>
			<input type="submit" id="sd" name = "sd"/>
	</form:form>
</body>
</html>