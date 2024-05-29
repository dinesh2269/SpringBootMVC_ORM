


<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
 <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style>
</head>
<body>
    <h2>Employee List</h2>
    <table>
        <thead>
            <tr>
                <th>Employee Number</th>
                <th>Department Number</th>
                <th>Employee Name</th>
                <th>Job</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${elist}">
                <tr>
                    <td><c:out value="${employee.empNo}" /></td>
                    <td><c:out value="${employee.deptNo}" /></td>
                    <td><c:out value="${employee.eName}" /></td>
                    <td><c:out value="${employee.job}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
