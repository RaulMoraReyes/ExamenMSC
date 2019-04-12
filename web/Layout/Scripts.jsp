<%-- 
    Document   : Scripts
    Created on : 24/03/2019, 11:12:45 AM
    Author     : Marko
--%>

<script src="<%= request.getContextPath() + "/Plugins/Scripts/jquery-3.0.0.min.js"  %>" type="text/javascript"></script>
<script src="<%= request.getContextPath() + "/Plugins/Scripts/umd/popper.min.js"  %>" type="text/javascript"></script>
<script src="<%= request.getContextPath() + "/Plugins/Scripts/bootstrap.min.js"  %>" type="text/javascript"></script>
<script>
    
$(function () {
  $('[data-toggle="tooltip"]').tooltip();
});
</script>
