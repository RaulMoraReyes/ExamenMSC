<%-- 
    Document   : Index
    Created on : 30/03/2019, 10:55:02 PM
    Author     : EdgarDegante
--%>

<%@page import="Modelos.Competencia"%>
<%@page import="Controlador.Competencias.OperacionesCompetencias"%>
<%-- <%@page import="Modelos.TipoCompetencia"%> 
<%@page import="Controlador.TipoCompetencias.OperacionesTipoCompetencias"%> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Competencia</title>
         <%@include file="../../Layout/Estilos.jsp" %>
    </head>
    <body>
         <%@include file="../../Layout/Navbar.jsp" %>
         <div class="container">
            <div class="form-group row">
                <div class="col-md-12">
                    <h2 class="text-center text-danger">Información General de Competencias</h2>
                </div>
            </div>
            <p>
                <a class="btn btn-success" href="Create.jsp">Agregar COmpetencia</a>
            </p>

            <table class="table table-hover table-sm">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Competencia</th>
                    <th>Valor máximo</th>
                    <th>Tipo Competencia</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    OperacionesCompetencias oc = new OperacionesCompetencias();
                    for(Competencia c : oc.GetCompetencias()){
                        out.print("<tr>");
                        out.print("<td>" + c.getId() + "</td>");
                        out.print("<td>" + c.getNombre()+ "</td>");
                        out.print("<td>" + c.getValormaxino()+ "</td>");
                        out.print("<td>" + c.getId_tipocompetencia()+ "</td>");
                        
                        out.print("<td><a href='Edit.jsp?Id=" + m.getId() + "' data-toggle='tooltip' class='btn btn-warning' title='Actualizar competencia'><i class='fa fa-pencil'></i></a></td>");
                        out.print("<td><a href='Delete.jsp?Id=" + m.getId() + "' data-toggle='tooltip' class='btn btn-danger' title='Eliminar competencia'><i class='fa fa-trash-o'></i></a></td>");
                        out.print("</tr>");
                    }
                   %>
            </tbody>
        </table>
        </div>
        
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
