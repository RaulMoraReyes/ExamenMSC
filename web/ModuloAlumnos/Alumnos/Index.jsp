<%-- 
    Document   : Index
    Created on : 24/03/2019, 11:14:56 AM
    Author     : Marko
--%>

<%@page import="Modelos.Alumno"%>
<%@page import="Controlador.Alumno.OperacionesAlumno"%>
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
                    <h2 class="text-center text-danger">Información General de Alumnos</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar nuevo alumno</a>
            </p>

            <table class="table table-hover table-sm">
                <thead>
                    <tr>
                        <th>No Control</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        OperacionesAlumno op = new OperacionesAlumno();
                        for (Alumno a : op.GetAlumnos()) {
                            out.print("<tr>");
                            out.print("<td>" + a.getNoControl() + "</td>");
                            out.print("<td>" + a.getNombre() + "</td>");
                            out.print("<td>" + a.getApepat() + "</td>");
                            out.print("<td>" + a.getApemat() + "</td>");
                            out.print("<td><a href='Details.jsp?nocontrol=" + a.getNoControl() + "' data-toggle='tooltip' class='btn btn-info' title='Ver detalles alumno'><i class='fa fa-info-circle'></i></a></td>");
                            out.print("<td><a href='Edit.jsp?nocontrol=" + a.getNoControl() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar alumno'><i class='fa fa-pencil'></i></a></td>");
                            out.print("<td><a href='Delete.jsp?nocontrol=" + a.getNoControl() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar alumno'><i class='fa fa-trash-o'></i></a></td>");
                            out.print("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>

        

        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
