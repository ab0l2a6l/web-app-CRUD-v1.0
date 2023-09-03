<%@ page import="controler.PersonControler" %>
<%@ page import="model.entity.Person" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/3/2023
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show one</title>
    <link rel="stylesheet" href="bootstrap.css">
</head>
<body>
    <%
        PersonControler personControler = new PersonControler();
        Person person ;
        person = personControler.selectOne(Long.parseLong(request.getParameter("id")));
    %>
    <table class="table table-hover table-dark">
        <tr>
            <td>ID</td>
            <td>FIRST NAME</td>
            <td>LAST NAME</td>
            <td>EMAIL</td>
            <td>AGE</td>
            <td>PHONE NUMBER</td>
        </tr>
        <tr>
            <td><%=person.getId()%></td>
            <td><%=person.getFirstName()%></td>
            <td><%=person.getLastName()%></td>
            <td><%=person.getEmail()%></td>
            <td><%=person.getAge()%></td>
            <td><%=person.getPhoneNumber()%></td>
        </tr>
    </table>
    if you want to back home page <a href="index.jsp"> click here</a>
</body>
</html>
