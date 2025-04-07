<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th,td,table{
	border:3px solid;
	text-align:center;
	margin:auto;
}
h1{
	text-align:center;
	color:red;
	text-decoration: underline;
}
img{
	width:20px;
	height:20px;
}
#sd{
	text-align:center;
	color:red;
	font-size: 30px;
	margin:auto;	
	display:block;
}
h3{
	color:green;
	text-align:center;
}
</style>
</head>
<body>
<h1>Total Records</h1>
<c:choose>
	<c:when test="${!empty records}">
		<table>
			<tr>
				<th>EMP No</th>
				<th>EMP Name</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Details</th>
			</tr>
			<c:forEach var="rec" items="${records}">
				<tr>
					<td>${rec.emoNum}</td>
					<td>${rec.EName}</td>
					<td>${rec.sal}</td>
					<td>${rec.designation}</td>
					<td>&nbsp<a href = "update_Data?emoNum=${rec.emoNum}"><img src = "images/pencil-solid.svg"/></a> &nbsp &nbsp <a onclick = "return confirm('Do you really want to Delete ')" href = "Delete_Data?emoNum=${rec.emoNum}"><img src = "images/user-xmark-solid.svg"/>&nbsp</a></td>
				</tr>
			</c:forEach>
		</table> &nbsp &nbsp 
		<c:if test = "${!empty response}">
			<h3>${response}</h3>
		</c:if>
		<a id = "sd" href = "show_Data">Insert Records</a>
	</c:when>
</c:choose>
</body>
</html>