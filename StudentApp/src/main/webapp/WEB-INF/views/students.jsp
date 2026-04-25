<%--
  Created by IntelliJ IDEA.
  User: sathv
  Date: 25-04-2026
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students</title>

</head>
<body>
<h2>All Students</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
        <th>Action</th>
    </tr>

    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.age}</td>

            <td>
                <a href="/delete/${s.id}">Delete</a>
                |
                <a href="/edit/${s.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
