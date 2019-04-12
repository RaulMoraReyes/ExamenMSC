<%-- 
    Document   : Details
    Created on : 29/03/2019, 09:52:13 PM
    Author     : Marko
--%>

<%@page import="Controlador.Alumno.AlumnoCompleto"%>
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
        <%
            String nocontrol = request.getParameter("nocontrol");
            System.out.println(nocontrol);
            OperacionesAlumno oa = new OperacionesAlumno();
            AlumnoCompleto a = oa.GetAlumnoCompleto(nocontrol);

        %>

        <div class="container">
            <div class="form-group">
                 <div class="col-md-12">
                    <h2 class="text-center text-danger">Información del alumno <%= a.getNoControl()%></h2>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-3">
                    <label>Número de Control</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtNoControl" id="txtNoControl" value="<%= a.getNoControl()%>" />
                </div>
            </div>
            <div class="form-group row">
                <div class="col-md-4">
                    <label>Nombre</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtNombre" id="txtNombre" value="<%= a.getNombre()%>" />
                </div>
                <div class="col-md-4">
                    <label>Apellido Paterno</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtPaterno" id="txtApepat" value="<%= a.getApepat()%>" />
                </div>
                <div class="col-md-4">
                    <label>Apellido Materno</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtMaterno" id="txtMaterno" value="<%= a.getApemat()%>" />
                </div>
            </div>
            <div class="form-group row">
                <div class="col-md-3">
                    <label>CURP</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtCurp" id="txtCurp" value="<%= a.getCURP()%>" />
                </div>
                <div class="col-md-2">
                    <label>Sexo</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtSexo" id="txtSexo" value="<%= a.getSexo()%>" />
                </div>
                <div class="col-md-2">
                    <label>Grupo</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtGrupo" id="txtGrupo" value="<%= a.getGrupo()%>" />
                </div>
                <div class="col-md-2">
                    <label>Estatus</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtEstatus" id="txtEstatus" value="<%= a.getCURP()%>" />
                </div>
                <div class="col-md-3">
                    <label>Modalidad</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtModalidad" id="txtModalidad" value="<%= a.getModalidad()%>" />
                </div>
            </div>
            <div class="form-group row">
                <div class="col-md-5">
                    <label>Carrera</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtCarrera" id="txtCarrera" value="<%= a.getCarrera()%>" />
                </div>
                <div class="col-md-5">
                    <label>Especialidad</label>
                    <input readonly="readonly" type="text" class="form-control" name="txtEspecialidad" id="txtEspecialidad" value="<%= a.getEspecialidad()%>" />
                </div>
                <div class="col-md-2">
                    <label>Semestre</label>
                    <input readonly="readonly" type="number" class="form-control" name="txtSemestre" id="txtSemestre" value="<%= a.getSemestre()%>"/>
                </div>
            </div>
            <div class="form-group text-center">
                <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
            </div>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>