<%-- 
    Document   : Index
    Created on : 30/03/2019, 02:19:58 PM
    Author     : Marko
--%>

<%@page import="Modelos.Estatus"%>
<%@page import="Controlador.Estatus.OperacionesEstatus"%>
<%@page import="Modelos.Especialidad"%>
<%@page import="Controlador.Especialidades.OperacionesEspecialidades"%>
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
                    <h2 class="text-center text-danger">Información General de Estatus de alumnos</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar Estatus</a>
            </p>

            <table class="table table-hover table-sm">
            <thead>
                <tr>
                    <th>Id Estatus</th>
                    <th>Nombre Estatus</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    OperacionesEstatus op = new OperacionesEstatus();
                    for(Estatus e : op.GetEstatus()){
                        out.print("<tr>");
                        out.print("<td>" + e.getId() + "</td>");
                        out.print("<td>" + e.getNombre_Estatus()+ "</td>");
                        out.print("<td><a href='Edit.jsp?Id=" + e.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar estatus'><i class='fa fa-pencil'></i></a></td>");
                        out.print("<td><a href='Delete.jsp?Id=" + e.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar estatus'><i class='fa fa-trash-o'></i></a></td>");
                        out.print("</tr>");
                    }
                   %>
            </tbody>
        </table>
        </div>
        
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
