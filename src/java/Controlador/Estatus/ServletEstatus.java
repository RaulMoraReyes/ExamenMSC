/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Estatus;

import Modelos.Estatus;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marko
 */
public class ServletEstatus extends HttpServlet {

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
            Estatus e = new Estatus();
            e.setNombre_Estatus(request.getParameter("txtEstatus"));
            OperacionesEstatus oe = new OperacionesEstatus();
            oe.Create(e);
            response.sendRedirect("ModuloAlumnos/Estatus/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            System.out.println("ok");
            Estatus e = new Estatus();
            e.setId(Byte.parseByte(request.getParameter("Id")));
            e.setNombre_Estatus(request.getParameter("txtEstatus"));
            OperacionesEstatus oe = new OperacionesEstatus();
            oe.Edit(e);
            response.sendRedirect("ModuloAlumnos/Estatus/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            byte Id = Byte.parseByte(request.getParameter("Id"));
             OperacionesEstatus oe = new OperacionesEstatus();
            oe.Delete(Id);
            response.sendRedirect("ModuloAlumnos/Estatus/Index.jsp");
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
