<%@ page import="java.util.List" %>
<%@ page import="model.entity.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="controler.PersonControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/3/2023
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all data</title>
  <link rel="stylesheet" href="bootstrap.css">
</head>
<body>
    <table class="table table-hover table-dark" >
      <tr>
        <td>ID</td>
        <td>FIRST NAME</td>
        <td>LAST NAME</td>
        <td>EMAIL</td>
        <td>AGE</td>
        <td>PHONE NUMBER</td>
      </tr>

      <%
        List<Person> personList = new ArrayList<>();
        PersonControler personControler = new PersonControler();
        personList = personControler.selectAll();
        for (Person person : personList) {

      %>
      <tr>
        <td><%=person.getId()%></td>
        <td><%=person.getFirstName()%></td>
        <td><%=person.getLastName()%></td>
        <td><%=person.getEmail()%></td>
        <td><%=person.getAge()%></td>
        <td><%=person.getPhoneNumber()%></td>
      </tr>
      <%
        }
      %>
    </table>
  if you want to back home page <a href="index.jsp"> click here</a>
</body>
</html>
