<%@page import="Modelos.Competencia"%>
<%@page import="Controlador.Competencias.OperacionesCompetencias"%>
<%-- <%@page import="Modelos.TipoCompetencia"%>
<%@page import="Controlador.TipoCompetencias.OperacionesCompetencias"%> --%>
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
           <br />
        <%
            byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesCompetencias oc = new OperacionesCompetencias();
            Competencia c = oc.GetCompetencia(id);
            String nombre = c.getNombre();
            
        %>
        <div class="container">
            <form action="/Alumnos/Competencias?accion=eliminar" method="post">
                <input type="hidden" value="<%= c.getId()%>" name="Id" />
                <div class="alert alert-danger" role="alert">
                    <h2 class="alert-heading">¡P R E A C U C I Ó N!</h2>
                    <h4>¿Está seguro que desea eliminar la competencia <%= nombre%>?</h4>
                    <hr>
                    <p class="mb-0">Una vez eliminada, ya no podrá visualizar su información</p>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-danger" type="submit">Eliminar Competencia</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
