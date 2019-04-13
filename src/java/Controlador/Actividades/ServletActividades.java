
package Controlador.Actividades;
import Modelos.Actividades.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletActividades extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("agregar")) {
            
            Actividades a = new Actividaddes();
            a.setDescripcion(request.getParameter("txtDescripcion"));
            a.setValor(request.getParameter("txtValor"));
            a.setId_Competencia(request.getParameter("txtId_Competencia"));
            a.setId_Competencia(request.getParameter("txtId_Ponderaciones"));
            OperacionesActividades oc = new OperacionesActividades();
            oc.Create(a);
            response.sendRedirect("ModuloAlumnos/Actividades/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            Actividades a = new Actividades();
            a.setId(Byte.parseByte(request.getParameter("id")));
            a.setDescripcion(request.getParameter("txtDescripcion"));
            a.setValor(request.getParameter("txtValor"));
            a.setId_Competencia(request.getParameter("txtId_Competencia"));
            a.setId_Competencia(request.getParameter("txtId_Ponderaciones"));

            OperacionesActividades oc = new OperacionesActividades();
            oc.Edit(a);
            response.sendRedirect("ModuloAlumnos/Actividades/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            byte Id = Byte.parseByte(request.getParameter("Id"));
            OperacionesActividades oc = new OperacionesActividades();
            oc.Delete(Id);
            response.sendRedirect("ModuloAlumnos/Carreras/Index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
