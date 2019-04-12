/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Alumno;

import Modelos.Alumno;
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
public class ServletAlumno extends HttpServlet {

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
            Alumno a = new Alumno();
            a.setNoControl(request.getParameter("txtNoControl"));
            a.setApepat(request.getParameter("txtPaterno"));
            a.setApemat(request.getParameter("txtMaterno"));
            a.setNombre(request.getParameter("txtNombre"));
            a.setCURP(request.getParameter("txtCurp"));
            a.setSexo(request.getParameter("txtSexo"));
            a.setGrupo(request.getParameter("cmbGrupo"));
            a.setId_status(Byte.parseByte(request.getParameter("cmbEstatus")));
            a.setId_Modalidad(Byte.parseByte(request.getParameter("cmbModalidad")));
            a.setId_Carrera(Byte.parseByte(request.getParameter("cmbCarrera")));
            a.setId_Especialidad(Byte.parseByte(request.getParameter("cmbEspecialidad")));
            a.setSemestre(Byte.parseByte(request.getParameter("txtSemestre")));
            a.setPwd("123");
            OperacionesAlumno oa = new OperacionesAlumno();
            oa.Create(a);
            response.sendRedirect("ModuloAlumnos/Alumnos/Index.jsp");
        } else if (accion.equalsIgnoreCase("actualizar")) {
            Alumno a = new Alumno();
            a.setNoControl(request.getParameter("txtNoControl"));
            a.setApepat(request.getParameter("txtPaterno"));
            a.setApemat(request.getParameter("txtMaterno"));
            a.setNombre(request.getParameter("txtNombre"));
            a.setCURP(request.getParameter("txtCurp"));
            a.setSexo(request.getParameter("txtSexo"));
            a.setGrupo(request.getParameter("cmbGrupo"));
            a.setId_status(Byte.parseByte(request.getParameter("cmbEstatus")));
            a.setId_Modalidad(Byte.parseByte(request.getParameter("cmbModalidad")));
            a.setId_Carrera(Byte.parseByte(request.getParameter("cmbCarrera")));
            a.setId_Especialidad(Byte.parseByte(request.getParameter("cmbEspecialidad")));
            a.setSemestre(Byte.parseByte(request.getParameter("txtSemestre")));
            a.setPwd("123");
            OperacionesAlumno oa = new OperacionesAlumno();
            oa.Edit(a);
            response.sendRedirect("ModuloAlumnos/Alumnos/Index.jsp");
        }
        else if(accion.equalsIgnoreCase("eliminar")){
            String nocontrol = request.getParameter("nocontrol");
            OperacionesAlumno oa = new OperacionesAlumno();
            oa.Delete(nocontrol);
            response.sendRedirect("ModuloAlumnos/Alumnos/Index.jsp");
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
