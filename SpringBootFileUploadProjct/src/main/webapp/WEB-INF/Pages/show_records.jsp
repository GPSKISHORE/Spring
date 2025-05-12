<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Candidate Records</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            padding: 20px;
        }

        h2 {
            color: #333;
            text-align: center;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            border-radius: 6px;
            overflow: hidden;
            margin: 0 auto;
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #2f80ed;
            color: white;
            text-transform: uppercase;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a {
            text-decoration: none;
            color: #2f80ed;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }

        .no-data {
            text-align: center;
            color: #888;
            margin-top: 40px;
        }
    </style>
</head>
<body>
    <h2>Candidate Records</h2>

    <c:choose>
        <c:when test="${not empty recD}">
            <table>
                <tr>
                    <th>SNo</th>
                    <th>Name</th>
                    <th>Resume</th>
                    <th>Image</th>
                </tr>
                <c:forEach var="i" items="${recD}" varStatus="loop">
                    <tr>
                        <td>${i.id}</td>
                        <td>${i.name}</td>
                        <td><a href="dowload?data=${i.id}&Type=resume">Download Resume</a></td>
                        <td><a href="dowload?data=${i.id}&Type=img">Download Image</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <div class="no-data">No records found.</div>
        </c:otherwise>
    </c:choose>
</body>
</html>
