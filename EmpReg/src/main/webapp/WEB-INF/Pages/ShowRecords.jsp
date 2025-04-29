<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', sans-serif;
        background-color: #f0f2f5;
        display: flex;
        flex-direction: column;
        align-items: center;
        min-height: 100vh;
    }

    h1 {
        margin-top: 40px;
        color: #333;
    }

    table {
        width: 90%;
        max-width: 1000px;
        border-collapse: collapse;
        margin-top: 30px;
        box-shadow: 0 4px 20px rgba(0,0,0,0.1);
        background: #fff;
        border-radius: 8px;
        overflow: hidden;
    }

    th, td {
        padding: 15px 20px;
        text-align: center;
        border-bottom: 1px solid #e0e0e0;
    }

    th {
        background-color: #3f51b5;
        color: white;
        font-weight: bold;
    }

    td img {
        width: 18px;
        height: 18px;
        vertical-align: middle;
        transition: transform 0.2s ease;
    }

    td a {
        text-decoration: none;
        margin: 0 5px;
    }

    td a:hover img {
        transform: scale(1.2);
    }

    #sd {
        display: inline-block;
        margin: 40px 0;
        background-color: #3f51b5;
        color: white;
        padding: 12px 20px;
        border-radius: 8px;
        text-decoration: none;
        font-size: 16px;
        transition: background 0.3s ease;
    }

    #sd:hover {
        background-color: #283593;
    }

    .no-records {
        margin-top: 80px;
        color: #666;
        font-size: 20px;
    }

    .pagination {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin: 30px 0;
        gap: 8px;
    }

    .page-link {
        background-color: #eef0f8;
        color: #333;
        padding: 8px 14px;
        border-radius: 6px;
        font-size: 15px;
        border: 1px solid #bbb;
        text-decoration: none;
        transition: all 0.5s ease;
        font-weight: bold;
    }

    .page-link:hover {
        background-color: #dbe0f0;
        border-color: #999;
    }

    .current-page {
        background-color: #3f51b5;
        color: white;
        font-weight: bold;
        border-color: #3f51b5;
        cursor: default;
    }
</style>
</head>
<body>
    <h1>Employee Record Dashboard</h1>

    <c:choose>
        <c:when test="${!empty DbRecods.getContent()}">
            <table>
                <tr>
                    <th>EMP No</th>
                    <th>EMP Name</th>
                    <th>Salary</th>
                    <th>Designation</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="rec" items="${DbRecods.getContent()}">
                    <tr>
                        <td>${rec.emoNum}</td>
                        <td>${rec.EName}</td>
                        <td>${rec.sal}</td>
                        <td>${rec.designation}</td>
                        <td>
                            <a href="update_Data?emoNum=${rec.emoNum}" title="Edit">
                                <img src="images/pencil-solid.svg" alt="Edit" />
                            </a>
                            <a href="Delete_Data?emoNum=${rec.emoNum}" title="Delete"
                               onclick="return confirm('Do you really want to delete this record?')">
                                <img src="images/user-xmark-solid.svg" alt="Delete" />
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>

            <c:if test="${!empty response}">
                <h3>${response}</h3>
            </c:if>

            <div class="pagination">
                <c:if test="${DbRecods.hasPrevious()}">
                    <a href="?page=${DbRecods.getPageable().getPageNumber()-1}" class="page-link">Previous</a>
                </c:if>

                <c:if test="${!DbRecods.isFirst()}">
                    <a href="?page=0" class="page-link">First</a>
                </c:if>

                <c:forEach var="i" begin="1" end="${DbRecods.getTotalPages()}" step="1">
                    <c:choose>
                        <c:when test="${i-1 == DbRecods.getPageable().getPageNumber()}">
                            <span class="page-link current-page">${i}</span>
                        </c:when>
                        <c:otherwise>
                            <a href="?page=${i-1}" class="page-link">${i}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>

                <c:if test="${!DbRecods.isLast()}">
                    <a href="?page=${DbRecods.getTotalPages()-1}" class="page-link">Last</a>
                </c:if>

                <c:if test="${DbRecods.hasNext()}">
                    <a href="?page=${DbRecods.getPageable().getPageNumber()+1}" class="page-link">Next</a>
                </c:if>
            </div>
        </c:when>
        <c:otherwise>
            <div class="no-records">No employee records found.</div>
        </c:otherwise>
    </c:choose>

    <a id="sd" href="Dinsrt">Insert New Record</a>
</body>
</html>
