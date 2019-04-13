<%-- 
    Document   : Index
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>

<%@page import="Modelos.Ponderaciones"%>
<%@page import="Controlador.Ponderaciones.OperacionesPonderaciones"%>
<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../Layout/Estilos.jsp" %>
    </head>
    <body>
        <%@include file="../../Layout/Navbar.jsp" %>
        <div class="container">
            <div class="form-group row">
                <div class="col-md-12">
                    <h2 class="text-center text-danger">Información General de Ponderaciones</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar nueva ponderación</a>
            </p>

            <table class="table table-hover table-sm">
                <thead>
                    <tr>
                        <th>Unidad</th>
                        <th>Porcentaje</th>
                        <th>Materia</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        OperacionesPonderaciones op = new OperacionesPonderaciones();
                        for (Ponderaciones a : op.getPonderaciones()) {
                            out.print("<tr>");
                            out.print("<td>" + a.getId() + "</td>");
                            out.print("<td>" + a.getUnidad() + "</td>");
                            out.print("<td>" + a.getPorcentaje() + "</td>");
                            out.print("<td>" + a.getId_Materia() + "</td>");
                            out.print("<td><a href='Details.jsp?nocontrol=" + a.getId() + "' data-toggle='tooltip' class='btn btn-info' title='Ver detalles ponderación'><i class='fa fa-info-circle'></i></a></td>");
                            out.print("<td><a href='Edit.jsp?nocontrol=" + a.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar ponderación'><i class='fa fa-pencil'></i></a></td>");
                            out.print("<td><a href='Delete.jsp?nocontrol=" + a.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar ponderación'><i class='fa fa-trash-o'></i></a></td>");
                            out.print("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>

        

        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
