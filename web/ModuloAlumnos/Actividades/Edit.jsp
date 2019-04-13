<%-- 
    Document   : Actualizar
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>

<%@page import="Controlador.Ponderaciones.OperacionesPonderaciones"%>
<%@page import="Controlador.Actividades.OperacionesActividades"%>
<%@page import="Controlador.Actividades.IOperacionesActividades"%>

<%@page import="Modelos.Actividades"%>
<%@page import="Modelos.Competencia"%>
<%@page import="Modelos.Ponderaciones"%>
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
            byte id = request.getParameter.("id");
            System.out.println(id);
            OperacionesActividades oa =new OperacionesActividades();
            Actividades a = oa.GetActividades(id);

            %>
        
        <div class="container">
            <form action="/Alumnos/Alumno?accion=actualizar" method="post">
                
                <div class="form-group row">
                    <div class="col-3">
                        <label>Id</label>
                        <input readonly="readonly" type="text" class="form-control" name="txtNoControl" id="txtNoControl" value="<%= a.getNoControl()%>" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-4">
                        <label>Descripción</label>
                        <input type="text" class="form-control" name="txtDescripcion" id="txtDescripcion" value="<%= a.getDescripcion()%>" />
                    </div>
                    <div class="col-md-4">
                        <label>Valor</label>
                        <input type="text" class="form-control" name="txtValor" id="txtValor" value="<%= a.getValor()%>" />
                    </div>
                    
                </div>
                    <div class="col-md-3">
                        <label>Competencia</label>
                        <select name="cmbCompetencia" id="cmbCompetencia" class="form-control">
                            <%
                                OperacionesCompetencias co = new OperacionesCompetenicas();
                                for (Competencia c : co.GetCompetencias()) {
                                    if(c.getId() == c.getId_Competencia()){
                                        out.print("<option selected='selected' value='" + c.getId() + "'>" + c.getNombre() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + c.getId() + "'>" + c.getNombre() + "</option>");
                                    }
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Ponderación</label>
                        <select name="cmbPonderacion" id="cmbPonderacion" class="form-control">
                            <%
                                OperacionesPonderaciones op = new OperacionesPonderaciones();
                                for (Ponderaciones p : op.getPonderaciones()) {
                                    if(p.getId() == p.getId()){
                                        out.print("<option selected='selected' value='" + p.getId() + "'>" + p.getUnidad() + "</option>");
                                    }
                                    else{
                                        out.print("<option value='" + p.getId() + "'>" + p.getUnidad() + "</option>");
                                    }
                                    
                                }
                            %>

                        </select>
                    </div>
                    
                </div>
                <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Actividad</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>