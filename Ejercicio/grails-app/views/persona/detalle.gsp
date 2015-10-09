<%--
  Created by IntelliJ IDEA.
  User: Sintel
  Date: 07/10/2015
  Time: 03:26 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
Nombre: <g:fieldValue field="nombre" bean="${persona}"></g:fieldValue>
Apellido Paterno: <g:fieldValue field="apellidoPaterno" bean="${persona}"></g:fieldValue>
Apellido Materno: <g:fieldValue field="apellidoPaterno" bean="${persona}"></g:fieldValue>
Fecha de nacimiento: ${persona.fechaNacimiento.format("dd/MM/yyyy")}
Edad: <g:fieldValue field="edad" bean="${persona}"></g:fieldValue>

<g:link controller="persona" action="index">Inicio</g:link>
<g:link controller="persona" action="create">Nuevo registro</g:link>
</body>
</html>