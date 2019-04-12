<%-- 
    Document   : newjspEdit
    Created on : 30/03/2019, 02:19:48 PM
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
               <%
           byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesEstatus oa = new OperacionesEstatus();
            Estatus e = oa.GetStatus(id);
            String nombre = e.getNombre_Estatus();
        %>
         <div class="container">
             <br />
             <form action="/Alumnos/Estatus?accion=actualizar" method="post">
                 <input type="hidden" name="Id" value="<%= e.getId()%>" />
                 <div class="form-group row">
                     <div class="col-md-5">
                         <label>Nombre del Estatus</label>
                         <input type="text" name="txtEstatus" id="txtEstatus" class="form-control" value="<%= e.getNombre_Estatus()%>" />
                     </div>
                 </div>
                 <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Estatus</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
             </form>
         </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
