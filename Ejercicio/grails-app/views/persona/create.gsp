<%--
  Created by IntelliJ IDEA.
  User: Sintel
  Date: 07/10/2015
  Time: 03:14 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:form controller="persona" action="guardarPersona">
        <h3>INGRESA TUS DATOS</h3>
        <h5>Nombre: </h5><g:textField name="nombre" required="true"></g:textField><br>
        <h5>Apellido Paterno: </h5><g:textField name="apellidoPaterno" required="true"></g:textField><br>
        <h5>Apellido Materno: </h5><g:textField name="apellidoMaterno" required="true"></g:textField><br>
        <h5>Fecha de nacimiento: </h5><g:textField name="fechaNacimiento" required="true"></g:textField><br>
        <h5>Edad: </h5><g:textField name="edad" required="true"></g:textField><br>
        <button type="submit">Guardar</button>
    </g:form>

<g:link controller="persona" action="index">Cancelar</g:link>
</body>
</html>