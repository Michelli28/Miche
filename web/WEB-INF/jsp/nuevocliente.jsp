

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"
              href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous" />
    </head>
    <body>
        <div class="container md-8">
            <div class="card">
                <div class="card-header">
                    <h2>Nuevo Cliente</h2>
                </div>
                <div class="card-body">
                    <form:form method="post" modelAttribute="cliente">
                        <div class="form-group">
                            <label for="razonSocial">Razón Social:</label>
                            <form:input path="razonSocial" cssClass="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="ruc">RUC:</label>
                            <form:input path="ruc" cssClass="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="idDistrito">Distrito:</label>
                            <form:input path="idDistrito" cssClass="form-control"  />
                        </div>
                        <div class="form-group">
                            <label for="direccion">Dirección:</label>
                            <form:input path="direccion" cssClass="form-control"  />
                        </div>
                        <div class="form-group">
                            <label for="broker">Broker:</label>
                            <form:input path="broker" cssClass="form-control"  />
                        </div>
                        <div class="form-group">
                            <label for="usuario">Usuario:</label>
                            <form:input path="usuario" cssClass="form-control"  />
                        </div>
                        <div class="form-group">
                            <label for="clave">Clave:</label>
                            <form:password path="clave" cssClass="form-control" placeholder="*********" />
                        </div>
                        <input type="submit" class="btn btn-primary"  value="Registrar">
                        <a class="btn btn-secondary" href="clientes.htm" role="button">Regresar</a>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
