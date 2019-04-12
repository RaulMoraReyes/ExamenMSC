<%-- 
    Document   : newjspEdit
    Created on : 30/03/2019, 02:19:48 PM
    Author     : Marko
--%>
<%@page import="Modelos.Carrera"%>
<%@page import="Controlador.Carreras.OperacionesCarreras"%>
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
            OperacionesCarreras oc = new OperacionesCarreras();
            Carrera c = oc.GetCarrera(id);
            String nombre = c.getNombre_Carrera();
        %>
        <div class="container">
            <br />
            <form action="/Alumnos/Carreras?accion=actualizar" method="post">
                <input type="hidden" name="Id" value="<%= c.getId()%>" />
                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Nombre de la Carrera</label>
                        <input type="text" name="txtNombreCarrera" id="txtNombreCarrera" class="form-control" value="<%= c.getNombre_Carrera()%>" />
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Nombre Corto de la Carrera</label>
                        <input type="text" name="txtNombreCortoCarrera" id="txtNombreCortoCarrera" class="form-control" value="<%= c.getNombre_Corto()%>"/>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Créditos máximos</label>
                        <input type="text" name="txtCreditosMaximos" id="txtCreditosMaximos" class="form-control" value="<%= c.getCreditos_Maximos()%>" />
                    </div>
                </div>
  <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Especialidad</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
