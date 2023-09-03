<%@ page import="model.entity.Person" %>
<%@ page import="controler.PersonControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/3/2023
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Person person = new Person();
    person.setId(Long.parseLong(request.getParameter("id")));
    person.setFirstName(request.getParameter("firstName"));
    person.setLastName(request.getParameter("lastName"));
    person.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));
    person.setEmail(request.getParameter("email"));
    person.setAge(Byte.parseByte(request.getParameter("age")));

    PersonControler personControler = new PersonControler();
    personControler.update(person);
    response.sendRedirect("three-update.jsp");
%>