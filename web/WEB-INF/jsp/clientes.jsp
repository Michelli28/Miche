
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
                                <th scope="col">Razón Social</th>
                                <th scope="col">RUC</th>
                                <th scope="col">Distrito</th>
                                <th scope="col">Dirección</th>
                                <th scope="col">Broker</th>
                                <th scope="col">Usuario</th>
                                <th scope="col">Contraseña</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="item" items="${clientes}">
                                <tr>
                                    <th scope="row">${item.idCliente}</th>
                                    <td>${item.razonSocial}</td>
                                    <td>${item.ruc}</td>
                                    <td>${item.idDistrito}</td>
                                    <td>${item.direccion}</td>
                                    <td>${item.broker}</td>
                                    <td>${item.usuario}</td>
                                    <td>${item.clave}</td>
                                    <td><a href="editarcliente.htm?id=${item.idCliente}" class="btn btn-info" role="button">Editar</a> 
                                        <input type="button" onclick="eliminar('${item.idCliente}')" class="btn btn-warning" value="Eliminar"/>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    
               
                </div>
            </div>
        </div>
    </body>
</html>
