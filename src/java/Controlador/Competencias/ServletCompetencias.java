/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Competencias;

import Controlador.Competencias.*;
import Modelos.Competencia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EdgarDegante
 */
public class ServletCompetencias extends HttpServlet {

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
            Competencia c = new Competencia();
            c.setNombre(request.getParameter("txtNombre"));
            c.setValormaxino(Byte.parseByte(request.getParameter("txtValorMaxino")));
            c.setId_tipocompetencia(Byte.parseByte(request.getParameter("txtId_TipoCompetencia")));
            OperacionesCompetencias oc = new OperacionesCompetencias();
            oc.Create(c);
            response.sendRedirect("ModuloAlumnos/Competencias/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            Competencia c = new Competencia();
            c.setNombre(request.getParameter("txtNombre"));
            c.setValormaxino(Byte.parseByte(request.getParameter("txtValorMaxino")));
            c.setId_tipocompetencia(Byte.parseByte(request.getParameter("txtId_TipoCompetencia")));
            OperacionesCompetencias oc = new OperacionesCompetencias();
            oc.Edit(c);
            response.sendRedirect("ModuloAlumnos/Competencias/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            byte Id = Byte.parseByte(request.getParameter("Id"));
            OperacionesCompetencias oc = new OperacionesCompetencias();
            oc.Delete(Id);
            response.sendRedirect("ModuloAlumnos/Competencias/Index.jsp");
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
