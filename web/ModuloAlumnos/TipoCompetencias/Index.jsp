<%-- 
    Document   : Index
    Created on : 30/03/2019, 02:19:58 PM
    Author     : Apango
--%>

<%@page import="Modelos.TipoCompetencia"%>
<%@page import="Controlador.TipoCompetencias.OperacionesTipoCompetencias"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TipoCompetencia</title>
         <%@include file="../../Layout/Estilos.jsp" %>
    </head>
    <body>
         <%@include file="../../Layout/Navbar.jsp" %>
         <div class="container">
            <div class="form-group row">
                <div class="col-md-12">
                    <h2 class="text-center text-danger">Información General de Tipo de Competencia</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar Tipo de Competencia</a>
            </p>

            <table class="table table-hover table-sm">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Tipo Competencia</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    OperacionesTipoCompetencias otc = new OperacionesTipoCompetencias();
                    for(TipoCompetencia tc : otc.GetTipoCompetencias()){
                        out.print("<tr>");
                        out.print("<td>" + tc.getId() + "</td>");
                        out.print("<td>" + tc.getTipocompetencia()+ "</td>");
                        out.print("<td><a href='Edit.jsp?Id=" + tc.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar modalidad'><i class='fa fa-pencil'></i></a></td>");
                        out.print("<td><a href='Delete.jsp?Id=" + tc.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar modalidad'><i class='fa fa-trash-o'></i></a></td>");
                        out.print("</tr>");
                    }
                   %>
            </tbody>
        </table>
        </div>
        
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
