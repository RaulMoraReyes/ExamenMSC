<%-- 
    Document   : Create
    Created on : 30/03/2019, 02:19:38 PM
    Author     : Marko
--%>

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
            <br />
            <form action="/Alumnos/Carreras?accion=agregar" method="post">
                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Nombre de la Carrera</label>
                        <input type="text" name="txtNombreCarrera" id="txtNombreCarrera" class="form-control" />
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Nombre Corto de la Carrera</label>
                        <input type="text" name="txtNombreCortoCarrera" id="txtNombreCortoCarrera" class="form-control" />
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-5">
                        <label>Créditos máximos</label>
                        <input type="text" name="txtCreditosMaximos" id="txtCreditosMaximos" class="form-control" />
                    </div>
                </div>
  <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-info" type="submit">Guardar Especialidad</button>
                      <a href="Index.jsp" class="btn btn-outline-success">Regresar</a>
                </div>
            </form>
        </div>

        <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
