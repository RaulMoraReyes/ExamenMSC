<%-- 
    Document   : Eliminar
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>


<%@page import="Modelos.Actividades"%>
<%@page import="Controlador.Actividades.OperacionesActividades"%>
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
            OperacionesActividades oc = new OperacionesActividades();
            Actividades a = oc.GetActividades(id);
            String descripcion = a.getDescripcion();
        %>

        <div class="container">
            <form action="/Actividades/Actividades?accion=eliminar" method="post">
                <input type="hidden" value="<%= a.getId()%>" name="id" />
                <div class="alert alert-danger" role="alert">
                    <h2 class="alert-heading">¡P R E A C U C I Ó N!</h2>
                    <h4>¿Está seguro que desea eliminar al actividad <%= descripcion %>?</h4>
                    <hr>
                    <p class="mb-0">Una vez eliminado, ya no podrá visualizar su información</p>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-danger" type="submit">Eliminar Actividad</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
