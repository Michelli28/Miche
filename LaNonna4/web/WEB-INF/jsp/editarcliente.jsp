<%-- 
    Document   : editarcliente
    Created on : Nov 19, 2019, 8:58:38 AM
    Author     : DEV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet"
              href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <div class="container md-8">
            <div class="card">
                <div class="card-header">
                    <h3>Editar Cliente</h3>
                </div>
                <div class="card-body">
                    <form:form method="post" modelAttribute="cliente">
                        <form:hidden path="idcliente" value="${cliente.idcliente}"/>
                        <div class="form-group">
                            <label for="nombre">Nombre:</label>
                            <form:input path="nombre" cssClass="form-control" value="${cliente.nombre}" />
                        </div>
                        <div class="form-group">
                            <label for="correo">Correo:</label>
                            <form:input path="correo" cssClass="form-control" placeholder="correo@dominio.com" value="${cliente.correo}"/>
                        </div>
                        <div class="form-group">
                            <label for="clave">Clave:</label>
                            <form:password path="clave" cssClass="form-control" placeholder="******"  value="${cliente.clave}"/>
                        </div>
                        <input type="submit" class="btn btn-primary"  value="Registrar">
                        <a class="btn btn-secondary" href="clientes.htm" role="button">Guardar</a>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
