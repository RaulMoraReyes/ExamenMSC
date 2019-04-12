<%-- 
    Document   : Index
    Created on : 30/03/2019, 02:19:58 PM
    Author     : Marko
--%>

<%@page import="Modelos.Carrera"%>
<%@page import="Controlador.Carreras.OperacionesCarreras"%>
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
                    <h2 class="text-center text-danger">Información General de Carreras</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar Carrera</a>
            </p>

            <table class="table table-hover table-sm">
            <thead>
                <tr>
                    <th>Id Carrera</th>
                    <th>Nombre Carrera</th>
                    <th>Nombre Corto Carrera</th>
                    <th>Creditos Máximos</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                   OperacionesCarreras oc = new OperacionesCarreras();
                    for(Carrera c : oc.GetCarreras()){
                        out.print("<tr>");
                        out.print("<td>" + c.getId() + "</td>");
                        out.print("<td>" + c.getNombre_Carrera()+ "</td>");
                        out.print("<td>" + c.getNombre_Corto()+ "</td>");
                        out.print("<td>" + c.getCreditos_Maximos()+ "</td>");
                        out.print("<td><a href='Edit.jsp?Id=" + c.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar carrera'><i class='fa fa-pencil'></i></a></td>");
                        out.print("<td><a href='Delete.jsp?Id=" + c.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar carrera'><i class='fa fa-trash-o'></i></a></td>");
                        out.print("</tr>");
                    }
                   %>
            </tbody>
        </table>
        </div>
        
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>

