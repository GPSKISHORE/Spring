<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sb"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shiva</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #1e1e2f;
            color: #f0f0f0;
            margin: 0;
            padding: 40px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        form {
            background-color: #2c2f48;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 12px rgba(0, 0, 0, 0.4);
            width: 100%;
            max-width: 500px;
        }

        table {
            width: 100%;
        }

        td {
            padding: 12px 8px;
            vertical-align: middle;
        }

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #444;
            border-radius: 6px;
            background-color: #1a1b2e;
            color: #f0f0f0;
            font-size: 14px;
        }

        input[type="text"]:focus, input[type="number"]:focus {
            outline: none;
            border-color: #007bff;
            background-color: #26283d;
        }

        .lang-switcher {
            margin-top: 25px;
            text-align: center;
        }

        .lang-link {
            text-decoration: none;
            margin: 0 8px;
            padding: 8px 14px;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        .lang-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form:form modelAttribute="enty">
        <table>
            <tr>
                <td><sb:message code="student.reg.name" /></td>
                <td><form:input path="sname" /></td>
            </tr>
            <tr>
                <td><sb:message code="student.reg.sno" /></td>
                <td><form:input path="sno" /></td>
            </tr>
            <tr>
                <td><sb:message code="student.reg.cls" /></td>
                <td><form:input path="sclass" /></td>
            </tr>
            <tr>
                <td><sb:message code="student.reg.marks" /></td>
                <td><form:input path="marks" /></td>
            </tr>
        </table>
        <div class="lang-switcher">
            <a class="lang-link" href="?lang=te_IN">Telugu</a>
            <a class="lang-link" href="?lang=hi_IN">Hindi</a>
            <a class="lang-link" href="?lang=ka_IN">Kannada</a>
            <a class="lang-link" href="?lang=en_US">English</a>
        </div>
    </form:form>
</body>
</html>
