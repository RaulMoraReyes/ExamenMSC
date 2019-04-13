
package Controlador.Ponderaciones;

import Controlador.Ponderaciones.*;
import Modelos.Ponderaciones;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletPonderaciones extends HttpServlet {

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
            Ponderaciones m = new Ponderaciones();
           m.setUnidad(Integer.parseInt(request.getParameter("txtUnidad")));
            OperacionesPonderaciones om = new OperacionesPonderaciones();
            om.Create(m);
            response.sendRedirect("ModuloAlumnos/Ponderaciones/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            Ponderaciones m = new Ponderaciones();
            m.setId(Byte.parseByte(request.getParameter("Id")));
            m.setUnidad(Integer.parseInt(request.getParameter("txtUnidad")));
            m.setPorcentaje(Byte.parseByte(request.getParameter("txtPorcentaje")));
            m.setId_Materia(request.getParameter("txtMateria"));
            
            OperacionesPonderaciones om = new OperacionesPonderaciones();
            om.Edit(m);
            response.sendRedirect("ModuloAlumnos/Modalidades/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            byte Id = Byte.parseByte(request.getParameter("Id"));
            OperacionesPonderaciones om = new OperacionesPonderaciones();
            om.Delete(Id);
            response.sendRedirect("ModuloAlumnos/Modalidades/Index.jsp");
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
