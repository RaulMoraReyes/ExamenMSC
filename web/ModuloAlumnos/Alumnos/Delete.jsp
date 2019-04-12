<%-- 
    Document   : Delete
    Created on : 29/03/2019, 09:51:17 PM
    Author     : Marko
--%>

<%@page import="Modelos.Alumno"%>
<%@page import="Controlador.Alumno.OperacionesAlumno"%>
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
            String nocontrol = request.getParameter("nocontrol");
            System.out.println(nocontrol);
            OperacionesAlumno oa = new OperacionesAlumno();
            Alumno a = oa.GetAlumnno(nocontrol);
            String nombre = a.getNombre() + " " + a.getApepat() + " " + a.getApemat();
        %>
        <div class="container">
            <form action="/Alumnos/Alumno?accion=eliminar" method="post">
                <input type="hidden" value="<%= a.getNoControl()%>" name="nocontrol" />
                <div class="alert alert-danger" role="alert">
                    <h2 class="alert-heading">¡P R E A C U C I Ó N!</h2>
                    <h4>¿Está seguro que desea eliminar al alumno <%= nombre%>?</h4>
                    <hr>
                    <p class="mb-0">Una vez eliminado, ya no podrá visualizar su información</p>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-danger" type="submit">Eliminar Alumno</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
