<%-- 
    Document   : Create
    Created on : 24/03/2019, 02:40:05 PM
    Author     : Marko
--%>

<%@page import="Modelos.Modalidad"%>
<%@page import="Controlador.Modalidades.OperacionesModalidades"%>
<%@page import="Modelos.Especialidad"%>
<%@page import="Controlador.Especialidades.OperacionesEspecialidades"%>
<%@page import="Modelos.Estatus"%>
<%@page import="Controlador.Estatus.OperacionesEstatus"%>
<%@page import="Modelos.Carrera"%>
<%@page import="Controlador.Carreras.OperacionesCarreras"%>
<%@page import="Modelos.Alumno"%>
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
        <div class="container">
            <form action="/Alumnos/Alumno?accion=agregar" method="post">
                <div class="form-group row">
                    <div class="col-3">
                        <label>Número de Control</label>
                        <input type="text" class="form-control" name="txtNoControl" id="txtNoControl" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-4">
                        <label>Nombre</label>
                        <input type="text" class="form-control" name="txtNombre" id="txtNombre" />
                    </div>
                    <div class="col-md-4">
                        <label>Apellido Paterno</label>
                        <input type="text" class="form-control" name="txtPaterno" id="txtApepat" />
                    </div>
                    <div class="col-md-4">
                        <label>Apellido Materno</label>
                        <input type="text" class="form-control" name="txtMaterno" id="txtMaterno" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-3">
                        <label>CURP</label>
                        <input type="text" class="form-control" name="txtCurp" id="txtCurp" />
                    </div>
                    <div class="col-md-2">
                        <label>Sexo</label>
                        <input type="text" class="form-control" name="txtSexo" id="txtSexo" />
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
                                    out.print("<option value='" + e.getId() + "'>" + e.getNombre_Estatus() + "</option>");
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
                                    out.print("<option value='" + m.getId() + "'>" + m.getNombre_modalidad() + "</option>");
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
                                    out.print("<option value='" + c.getId() + "'>" + c.getNombre_Carrera() + "</option>");
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
                                    out.print("<option value='" + e.getId() + "'>" + e.getNombre_Especialidad() + "</option>");
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-md-2">
                        <label>Semestre</label>
                        <input type="number" class="form-control" name="txtSemestre" id="txtSemestre" />
                    </div>
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-info" type="submit">Guardar Alumno</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
