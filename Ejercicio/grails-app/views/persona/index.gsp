<%--
  Created by IntelliJ IDEA.
  User: Sintel
  Date: 07/10/2015
  Time: 02:44 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <table>
            <thead>
                <tr>
                    <td>Nombre: </td>
                    <td>Apellido Paterno: </td>
                    <td>Apellido Materno: </td>
                    <td>Edad: </td>
                    <td>Fecha de nacimiento: </td>
                </tr>
            </thead>
        <tbody>
            <g:each in="${personas}" var="persona">
                <tr>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellidoPaterno}</td>
                    <td>${persona.apellidoMaterno}</td>
                    <td>${persona.edad}</td>
                    <td>${persona.fechaNacimiento.format("dd/MM/yyyy")}</td>
                </tr>
            </g:each>
        </tbody>
    </table>

<g:link controller="persona" action="create">Nuevo</g:link>
</body>
</html>