<%-- 
    Document   : Index
    Created on : 30/03/2019, 02:19:58 PM
    Author     : Marko
--%>

<%@page import="Modelos.Modalidad"%>
<%@page import="Controlador.Modalidades.OperacionesModalidades"%>
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
                    <h2 class="text-center text-danger">Información General de Modalidades</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar Modalidad</a>
            </p>

            <table class="table table-hover table-sm">
            <thead>
                <tr>
                    <th>Id Especialidad</th>
                    <th>Nombre Modalidad</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    OperacionesModalidades op = new OperacionesModalidades();
                    for(Modalidad m : op.GetModalidades()){
                        out.print("<tr>");
                        out.print("<td>" + m.getId() + "</td>");
                        out.print("<td>" + m.getNombre_modalidad()+ "</td>");
                        out.print("<td><a href='Edit.jsp?Id=" + m.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar modalidad'><i class='fa fa-pencil'></i></a></td>");
                        out.print("<td><a href='Delete.jsp?Id=" + m.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar modalidad'><i class='fa fa-trash-o'></i></a></td>");
                        out.print("</tr>");
                    }
                   %>
            </tbody>
        </table>
        </div>
        
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
