<%-- 
    Document   : newjspEdit
    Created on : 30/03/2019, 02:19:48 PM
    Author     : Marko
--%>
<%@page import="Controlador.Competencias.OperacionesCompetencias"%>
<%@page import="Modelos.Competencia"%>
<%@page import="Controlador.Competencias.IOperacionesCompetencias"%>
<%--<%@page import="Modelos.TipoCompetencia"%>
<%@page import="Controlador.TipoCompetencias.OperacionesTipoCompetencias"%> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
         <%@include file="../../Layout/Estilos.jsp" %>
    </head>
    <body>
         <%@include file="../../Layout/Navbar.jsp" %>
         <%
            byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesCompetencias oc = new OperacionesCompetencias();
            Competencia c = oc.GetCompetencia(id);
            String nombre = c.getNombre();
        %>
         <div class="container">
             <br />
             <form action="/Alumnos/Modalidades?accion=actualizar" method="post">
                 <input type="hidden" name="Id" value="<%= c.getId()%>" />
                 <div class="for-mgroup row">
                     <div class="col-md-5">
                         <label>Nombre de la Especialidad</label>
                         <input type="text" name="txtModalidad" id="txtModalidad" class="form-control" value="<%= c.getNombre()%>" />
                     </div>
                 </div>
                 <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Competencia</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
             </form>
         </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
