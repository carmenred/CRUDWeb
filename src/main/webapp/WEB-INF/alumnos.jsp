<%--
  Created by IntelliJ IDEA.
  User: haepr
  Date: 21/04/2023
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.car.crudweb.entities.Alumnos" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>M06 Acceso a datos</title>
</head>
<body>
<h1>Lista de Alumnos</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Nombre de usuario</th>
        <th>Contraseña</th>
        <th>Nota</th>
        <th>Modulo</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Alumnos> alumnosList = (List<Alumnos>) request.getAttribute("alumnosList");
        for (Alumnos alumno : alumnosList) {
    %>
    <tr>
        <td><%= alumno.getId() %></td>
        <td><%= alumno.getNombre() %></td>
        <td><%= alumno.getNomUser() %></td>
        <td><%= alumno.getPassword() %></td>
        <td><%= alumno.getNota() %></td>
        <td><%= alumno.getModulo() %></td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>

