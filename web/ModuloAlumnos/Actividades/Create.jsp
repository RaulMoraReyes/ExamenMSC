<%-- 
    Document   : Create
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>

<%@page import="Modelos.Competencia"%>
<%@page import="Controlador.Competencias.OperacionesCompetencias"%>
<%@page import="Modelos.Ponderaciones"%>
<%@page import="Controlador.Ponderaciones.OperacionesPonderaciones"%>
<%@page import="Modelos.Actividad"%>
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
            <form action="/Actividades/Actividad?accion=agregar" method="post">
                <div class="form-group row">
                    <div class="col-3">
                        <label>Descripción</label>
                        <input type="text" class="form-control" name="txtDescripcion" id="txtDescripcion" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-4">
                        <label>Valor</label>
                        <input type="text" class="form-control" name="txtValor" id="txtValor" />
                    </div>
               
                </div>
                <div class="form-group row">             
                    <div class="col-md-2">
                        <label>Competencia</label>
                        <select name="cmbCompetencia" id="cmbCompetencia" class="form-control">
                            <%
                                OperacionesCompetencias co = new OperacionesCompetencias();
                                for (Actividad a : co.GetActividad()) {
                                    out.print("<option value='" + a.getId() + "'>" + a.getNombre_Competencia() + "</option>");
                                }
                            %>
                        </select>
                    
                    <div class="col-md-3">
                        <label>Ponderación</label>
                        <select name="cmbPonderacion" id="cmbPonderacion" class="form-control">
                            <%
                                OperacionesPonderaciones po = new OperacionesPonderaciones();
                                for (Ponderacion p : po.GetPonderaciones()) {
                                    out.print("<option value='" + p.getId() + "'>" + p.getPorcentaje_Ponderacion() + "</option>");
                                }
                            %>
                        </select>
                    </div>
                </div>
             
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-info" type="submit">Guardar Actividad</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
