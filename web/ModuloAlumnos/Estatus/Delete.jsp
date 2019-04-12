<%-- 
    Document   : Delete
    Created on : 30/03/2019, 02:19:43 PM
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
           <br />
        <%
            byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesEstatus oa = new OperacionesEstatus();
            Estatus e = oa.GetStatus(id);
            String nombre = e.getNombre_Estatus();
        %>
        <div class="container">
            <form action="/Alumnos/Estatus?accion=eliminar" method="post">
                <input type="hidden" value="<%= e.getId()%>" name="Id" />
                <div class="alert alert-danger" role="alert">
                    <h2 class="alert-heading">¡P R E A C U C I Ó N!</h2>
                    <h4>¿Está seguro que desea eliminar el estatus <%= nombre%>?</h4>
                    <hr>
                    <p class="mb-0">Una vez eliminado, ya no podrá visualizar su información</p>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-danger" type="submit">Eliminar Estatus</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
