<%--
  Created by IntelliJ IDEA.
  User: sathv
  Date: 25-04-2026
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Edit Student</h2>

<form action="/update" method="post">

    <input type="hidden" name="id" value="${student.id}"/>

    Name: <input type="text" name="name" value="${student.name}"/><br>
    Email: <input type="email" name="email" value="${student.email}"/><br>
    Age: <input type="number" name="age" value="${student.age}"/><br>

    <button type="submit">Update</button>

</form>

</body>
</html>
