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
             <form action="/Alumnos/Competencias?accion=agregar" method="post">
                 <div class="form-group row">
                     
                     <div class="col-md-5">
                         <label>Competencia</label>
                         <input type="text" name="txtNombre" id="txtCompetencia" class="form-control" />
                     </div>
                     
                     <div class="col-md-5">
                         <label>Nombre de la Modalidad</label>
                         <input type="number" name="txtValorMaxino" id="txtValorMaxino" class="form-control" />
                     </div>
                     
                     <div class="col-md-5">
                         <label>Nombre de la Modalidad</label>
                         <input type="number" name="txtId_TipoCompetencia" id="txtId_TipoCompetencia" class="form-control" />
                     </div>
                     
                 </div>
                 <div class="form-group">
                    <button id="btnGuardar" class="btn btn-outline-info" type="submit">Guardar Competencia</button>
                </div>
             </form>
         </div>
         
           <%@include file="../../Layout/Scripts.jsp" %>
    </body>
</html>
