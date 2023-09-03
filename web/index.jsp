<%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/3/2023
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CRUD</title>
    <script src="insertValidation.js"></script>
    <script src="selectOneValidation.js"></script>
    <script src="deleteValidation.js"></script>
    <script src="updateValidation.js"></script>
  </head>
  <body>
  -----------insert-----------------------------------------------------------------------------------------------------
    <form id="sub-insert" action="two-insert.jsp"> <%-- barate save--%>
        <input type="text" name="firstName" id="insertFirstName" placeholder="first  name">
        <input type="text" name="lastName" id="insertLastName" placeholder="last name">
        <input type="text" name="email" id="insertEmail" placeholder="email">
        <input type="text" name="age" id="insertAge" placeholder="age">
        <input type="text" name="phoneNumber" id="insertPhoneNumber" placeholder="phone number">
        <input type="text" name="id" id="insertId" placeholder="id">
        <input type="button" onclick="insertValidation()" value="submit">
    </form>
  -----------delete-----------------------------------------------------------------------------------------------------
    <form id="sub-delete" action="two-delete.jsp"> <%-- barate delete--%>
      <input type="text" name="firstName" id="deleteFirstName" placeholder="first  name">
      <input type="text" name="lastName" id="deleteLastName" placeholder="last name">
      <input type="text" name="email" id="deleteEmail" placeholder="email">
      <input type="text" name="age" id="deleteAge" placeholder="age">
      <input type="text" name="phoneNumber" id="deletePhoneNumber" placeholder="phone number">
      <input type="text" name="id" id="deleteId" placeholder="id">
      <input type="button" onclick="deleteValidation()" value="submit">
    </form>
  -----------update-----------------------------------------------------------------------------------------------------
    <form id="sub-update" action="two-update.jsp"> <%-- barate update--%>
      <input type="text" name="firstName" id="updateFirstName" placeholder="new first  name">
      <input type="text" name="lastName" id="updateLastName" placeholder="new last name">
      <input type="text" name="email" id="updateEmail" placeholder="new email">
      <input type="text" name="age" id="updateAge" placeholder="new age">
      <input type="text" name="phoneNumber" id="updatePhoneNumber" placeholder="new phone number">
      <input type="text" name="id" id="updateId" placeholder="id">
      <input type="button" onclick="updateValidation()" value="submit">
    </form>
  -----------show all---------------------------------------------------------------------------------------------------
    <form action="selectAll.jsp"> <%-- barate selectAll--%>
      <input type="submit" value="show all">
    </form>
  -----------selecet one------------------------------------------------------------------------------------------------
    <form id="sub-findOne" action="findOne.jsp"> <%-- barate findOne--%>
      <input type="text" name="id" id="findOneId" placeholder="id">
      <input type="button" onclick="selectOneValidation()" value="submit">
    </form>
  </body>
</html>
