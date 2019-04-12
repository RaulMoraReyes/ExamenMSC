<%-- 
    Document   : newjspEdit
    Created on : 30/03/2019, 02:19:48 PM
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
         <%
            byte id = Byte.parseByte(request.getParameter("Id"));
            OperacionesModalidades em = new OperacionesModalidades();
            Modalidad m = em.GetModalidad(id);
            String nombre = m.getNombre_modalidad();
        %>
         <div class="container">
             <br />
             <form action="/Alumnos/Modalidades?accion=actualizar" method="post">
                 <input type="hidden" name="Id" value="<%= m.getId()%>" />
                 <div class="form-group row">
                     <div class="col-md-5">
                         <label>Nombre de la Especialidad</label>
                         <input type="text" name="txtModalidad" id="txtModalidad" class="form-control" value="<%= m.getNombre_modalidad()%>" />
                     </div>
                 </div>
                 <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Modalidad</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
             </form>
         </div>
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
