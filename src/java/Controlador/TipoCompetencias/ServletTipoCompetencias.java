/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.TipoCompetencias;

import Controlador.TipoCompetencias.*;
import Modelos.TipoCompetencia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Apango
 */
public class ServletTipoCompetencias extends HttpServlet {

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
            TipoCompetencia tc = new TipoCompetencia();
            tc.setTipocompetencia(request.getParameter("txtTipoCompetencia"));
            OperacionesTipoCompetencias om = new OperacionesTipoCompetencias();
            om.Create(tc);
            
            response.sendRedirect("ModuloAlumnos/TipoCompetencias/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            TipoCompetencia tc = new TipoCompetencia();
            tc.setId(Byte.parseByte(request.getParameter("Id")));
            tc.setTipocompetencia(request.getParameter("txtTipoCompetencia"));
            OperacionesTipoCompetencias om = new OperacionesTipoCompetencias();
            om.Edit(tc);
            response.sendRedirect("ModuloAlumnos/TipoCompetencia/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            byte Id = Byte.parseByte(request.getParameter("Id"));
            OperacionesTipoCompetencias om = new OperacionesTipoCompetencias();
            om.Delete(Id);
            response.sendRedirect("ModuloAlumnos/TipoCompetencia/Index.jsp");
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