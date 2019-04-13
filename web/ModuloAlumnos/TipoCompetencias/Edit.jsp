<%-- 
    Document   : newjspEdit
    Created on : 30/03/2019, 02:19:48 PM
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
         <%
            byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesTipoCompetencias otc = new OperacionesTipoCompetencias();
            TipoCompetencia tc = otc.GetTipoCompetencia(id);
            String nombre = tc.getTipocompetencia();
        %>
         <div class="container">
             <br />
             <form action="/Alumnos/Modalidades?accion=actualizar" method="post">
                 <input type="hidden" name="Id" value="<%= tc.getId()%>" />
                 <div class="form-group row">
                     <div class="col-md-5">
                         <label>Tipo Competencia</label>
                         <input type="text" name="txtModalidad" id="txtModalidad" class="form-control" value="<%= tc.getTipocompetencia()%>" />
                     </div>
                 </div>
                 <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Tipo de Competencia</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
             </form>
         </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
