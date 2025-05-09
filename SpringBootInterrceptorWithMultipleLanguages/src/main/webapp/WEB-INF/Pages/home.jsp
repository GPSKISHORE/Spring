<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="tg" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shiva</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h1 {
            color: #333;
            margin-top: 60px;
        }

        h2 a {
            text-decoration: none;
            color: #007bff;
            font-size: 20px;
            transition: color 0.3s;
        }

        h2 a:hover {
            color: #0056b3;
        }

        p {
            margin-top: 40px;
        }

        a.lang-link {
            text-decoration: none;
            margin: 0 15px;
            padding: 8px 16px;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
            transition: background-color 0.3s;
            font-weight: bold;
        }

        a.lang-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1><tg:message code="student.welcome" /></h1>

    <h2><a href="register"><tg:message code="student.reg" /></a></h2>

	<h1>Get Used Locale - ${pageContext.response.locale}</h1>
	<fmt:setLocale value="${pageContext.response.locale}"/>
	
	<jsp:useBean id="dt" class="java.util.Date"></jsp:useBean>
	<fmt:formatDate value="${dt}" var="dat"/>
	<h2>Current Date is - ${dat}</h2>
	<fmt:formatDate value="${dt}" var="dat1" dateStyle="FULL"/>
	<h3>Full Current Date is - ${dat1}</h3>
	<fmt:formatDate value="${dt}" var="dat1" dateStyle="MEDIUM"/>
	<h4>Medium Current Date is - ${dat1}</h4>
	<fmt:formatDate value="${dt}" var="dat1" dateStyle="SHORT"/>
	<h4>Short Current Date is - ${dat1}</h4>
	
	<fmt:formatNumber var="num" value = "1000000000"></fmt:formatNumber>
	<h5>Number Format : ${num}</h5>
	
	<fmt:formatNumber var="num" value = "1000000000" type="CURRENCY"></fmt:formatNumber>
	<h5>Number Format : ${num}</h5>
	
	<fmt:formatDate value="${dt}" var="dat1" type="time" timeStyle="MEDIUM"/>
	<h5>Time Format : ${dat1}</h5>
    <p>
        <a class="lang-link" href="?lang=te_IN">Telugu</a>
        <a class="lang-link" href="?lang=hi_IN">Hindi</a>
        <a class="lang-link" href="?lang=ka_IN">Kannada</a>
        <a class="lang-link" href="?lang=en_US">English</a>
    </p>
    
    
</body>
</html>
