<%-- 
    Document   : clientes
    Created on : Nov 19, 2019, 8:09:32 AM
    Author     : DEV
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <h3>Clientes</h3>
                </div>
                <div class="card-body">
                    <a class="btn btn-primary" href="nuevocliente.htm" role="button">Nuevo</a>
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Correo</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="item" items="${clientes}">
                                <tr>
                                    <th scope="row">${item.idcliente}</th>
                                    <td>${item.nombre}</td>
                                    <td>${item.correo}</td>
                                    <td><a href="editarcliente.htm?id=${item.idcliente}" class="btn btn-info" role="button">Editar</a> 
                                        <input type="button" onclick="eliminar('${item.idcliente}')" class="btn btn-warning" value="Eliminar"/>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function eliminar(id) {
                if (confirm("¿Desea eliminar el cliente?")) {
                    window.location.href = "eliminarcliente.htm?id=" + id;
                    return true;
                }
                return false;
            }
        </script>
    </body>
</html>
