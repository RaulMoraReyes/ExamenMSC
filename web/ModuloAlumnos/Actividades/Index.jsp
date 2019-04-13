<%-- 
    Document   : Index
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>

<%@page import="Modelos.Actividades"%>
<%@page import="Controlador.Actividades.OperacionesActividades"%>
<%@page import="Modelos.Alumno"%>
<%@page import="Controlador.Actividades.IOperacionesActividades"%>
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
                    <h2 class="text-center text-danger">Información General de Actividades</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar nueva actividad</a>
            </p>

            <table class="table table-hover table-sm">
                <thead>
                    <tr>
                        <th>Descripción</th>
                        <th>Valor</th>
                        <th>Id_Competencia</th>
                        <th>id_Ponderación</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        OperacionesActividades op = new OperacionesActividades();
                        for (Actividades a : op.GetActividades()) {
                            out.print("<tr>");
                            out.print("<td>" + a.getDescripcion() + "</td>");
                            out.print("<td>" + a.getValor() + "</td>");
                            out.print("<td>" + a.getId_Competencia() + "</td>");
                            out.print("<td>" + a.getId_Ponderacion() + "</td>");
                            out.print("<td><a href='Details.jsp?id=" + a.getId() + "' data-toggle='tooltip' class='btn btn-info' title='Ver detalles actividad'><i class='fa fa-info-circle'></i></a></td>");
                            out.print("<td><a href='Edit.jsp?id=" + a.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar actividad'><i class='fa fa-pencil'></i></a></td>");
                            out.print("<td><a href='Delete.jsp?id=" + a.getId()+ "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar actividad'><i class='fa fa-trash-o'></i></a></td>");
                            out.print("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>

        

        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
