<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Page</h1>
<b>Entity Class</b>
<c:if test = "${!empty EnClas}">
	<c:forEach var = "en" items="${EnClas}">
		${en.sno},${en.name}
	</c:forEach>
</c:if>

<!-- h2><a href = "time">If u want to get Data and time click here</a></h2>
<b>Names from java</b><br>
<c:if test="${!empty Names}">
	<c:forEach var="nm" items = "${Names}">
		${nm},<br>
	</c:forEach>
</c:if><br><br><br>

<b>Vepans from java</b><br>
<c:if test="${!empty Vepana}">
	<c:forEach var = "vep" items = "${Vepana}">
		${vep},<br>
	</c:forEach>
</c:if><br><br><br>

<b>Locations from java</b><br>
<c:if test="${!empty Locations}">
	<c:forEach var = "loc" items = "${Locations}">
		${loc.key} -> ${loc.value}<br>
	</c:forEach>
	<br>${Locations.Patna},
</c:if><br><br><br-->

</body>
</html>