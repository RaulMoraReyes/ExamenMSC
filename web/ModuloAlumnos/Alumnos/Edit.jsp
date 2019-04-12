<%-- 
    Document   : Actualizar
    Created on : 29/03/2019, 08:25:24 PM
    Author     : Marko
--%>

<%@page import="Controlador.Alumno.OperacionesAlumno"%>
<%@page import="Modelos.Alumno"%>
<%@page import="Modelos.Modalidad"%>
<%@page import="Modelos.Carrera"%>
<%@page import="Controlador.Carreras.OperacionesCarreras"%>
<%@page import="Modelos.Especialidad"%>
<%@page import="Controlador.Especialidades.OperacionesEspecialidades"%>
<%@page import="Controlador.Modalidades.OperacionesModalidades"%>
<%@page import="Modelos.Estatus"%>
<%@page import="Controlador.Estatus.OperacionesEstatus"%>
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
            Alumno a = oa.GetAlumnno(nocontrol);

            %>
        
        <div class="container">
            <form action="/Alumnos/Alumno?accion=actualizar" method="post">
                
                <div class="form-group row">
                    <div class="col-3">
                        <label>Número de Control</label>
                        <input readonly="readonly" type="text" class="form-control" name="txtNoControl" id="txtNoControl" value="<%= a.getNoControl()%>" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-4">
                        <label>Nombre</label>
                        <input type="text" class="form-control" name="txtNombre" id="txtNombre" value="<%= a.getNombre()%>" />
                    </div>
                    <div class="col-md-4">
                        <label>Apellido Paterno</label>
                        <input type="text" class="form-control" name="txtPaterno" id="txtApepat" value="<%= a.getApepat()%>" />
                    </div>
                    <div class="col-md-4">
                        <label>Apellido Materno</label>
                        <input type="text" class="form-control" name="txtMaterno" id="txtMaterno" value="<%= a.getApemat()%>" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-3">
                        <label>CURP</label>
                        <input type="text" class="form-control" name="txtCurp" id="txtCurp" value="<%= a.getCURP()%>" />
                    </div>
                    <div class="col-md-2">
                        <label>Sexo</label>
                        <input type="text" class="form-control" name="txtSexo" id="txtSexo" value="<%= a.getSexo()%>" />
                    </div>
                    <div class="col-md-2">
                        <label>Grupo</label>
                        <select name="cmbGrupo" id="cmbGrupo" class="form-control">
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="C">C</option>
                            <option value="D">D</option>
                            <option value="E">E</option>
                        </select>
                    </div>
                    <div class="col-md-2">
                        <label>Estatus</label>
                        <select name="cmbEstatus" id="cmbEstatus" class="form-control">
                            <%
                                OperacionesEstatus es = new OperacionesEstatus();
                                for (Estatus e : es.GetEstatus()) {
                                    if(e.getId() == a.getId_status()){
                                        out.print("<option selected='selected' value='" + e.getId() + "'>" + e.getNombre_Estatus() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + e.getId() + "'>" + e.getNombre_Estatus() + "</option>");
                                    }
                                    
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-md-3">
                        <label>Modalidad</label>
                        <select name="cmbModalidad" id="cmbModalidad" class="form-control">
                            <%
                                OperacionesModalidades mo = new OperacionesModalidades();
                                for (Modalidad m : mo.GetModalidades()) {
                                    if(m.getId() == a.getId_Modalidad()){
                                        out.print("<option selected='selected' value='" + m.getId() + "'>" + m.getNombre_modalidad() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + m.getId() + "'>" + m.getNombre_modalidad() + "</option>");
                                    }
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Carrera</label>
                        <select name="cmbCarrera" id="cmbCarrera" class="form-control">
                            <%
                                OperacionesCarreras oc = new OperacionesCarreras();
                                for (Carrera c : oc.GetCarreras()) {
                                    if(c.getId() == a.getId_Carrera()){
                                        out.print("<option selected='selected' value='" + c.getId() + "'>" + c.getNombre_Carrera() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + c.getId() + "'>" + c.getNombre_Carrera() + "</option>");
                                    }
                                    
                                }
                            %>

                        </select>
                    </div>
                    <div class="col-md-5">
                        <label>Especialidad</label>
                        <select name="cmbEspecialidad" id="cmbEspecialidad" class="form-control">
                            <%
                                OperacionesEspecialidades esp = new OperacionesEspecialidades();
                                for (Especialidad e : esp.GetEspecialidades()) {
                                    if(e.getId() == a.getId_Especialidad()){
                                        out.print("<option selected='selected' value='" + e.getId() + "'>" + e.getNombre_Especialidad() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + e.getId() + "'>" + e.getNombre_Especialidad() + "</option>");
                                    }
                                    
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-md-2">
                        <label>Semestre</label>
                        <input type="number" class="form-control" name="txtSemestre" id="txtSemestre" value="<%= a.getSemestre()%>"/>
                    </div>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Alumno</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>