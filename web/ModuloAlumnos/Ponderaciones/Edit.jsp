<%-- 
    Document   : Actualizar
    Created on : 12/04/2019, 08:17:13 PM
    Author     : Elizabeth
--%>

<%@page import="Controlador.Ponderaciones.OperacionesPonderaciones"%>
<%@page import="Modelos.Ponderaciones"%>
<%@page import="Controlador.Materias.OperacionesMaterias"%>


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
            String id = request.getParameter("id");
            System.out.println(id);
            OperacionesPonderaciones oa = new OperacionesPonderaciones();
            Ponderaciones a = oa.GetPonderaciones(id);

            %>
        
        <div class="container">
                     <form action="/Ponderaciones/Ponderaciones?accion=agregar" method="post">
                <div class="form-group row">
                    <div class="col-3">
                        <label>Unidad</label>
                        <input type="text" class="form-control" name="txtUnidad" id="txtUnidad" />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-4">
                        <label>Porcentaje</label>
                        <input type="text" class="form-control" name="txtPorcentaje" id="txtPorcentaje" />
                    </div>
                    <div class="col-md-2">
                        <label>Materia</label>
                        <select name="cmbMateria" id="cmbMateria" class="form-control">
                            <%
                                OperacionesMateria es = new OperacionesMateria();
                                for (Materia m : es.GetMateria()) {
                                    out.print("<option value='" + m.getId() + "'>" + m.getNombre() + "</option>");
                                }
                            %>
                        </select>
                    </div>
                </div>
           
            <div class="form-group text-center">
                    <button id="btnGuardar" class="btn btn-outline-warning" type="submit">Actualizar Ponderación</button>
                    <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>
        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>