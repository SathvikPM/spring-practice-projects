<%--
  Created by IntelliJ IDEA.
  User: sathv
  Date: 08-04-2026
  Time: 00:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Register</h1>
<form action="/save" method="post">
    <label>Name</label>
    <input name="name" type="text">
    <br>
    <label>Email</label>
    <input name="email" type="email">
    <br>
    <label>Age</label>
    <input name="age" type="number">

    <button type="submit">Submit</button>
    <br>
    <a href="/students">
    <button type="button">Get All Students</button>
    </a>
</form>
</body>
</html>
