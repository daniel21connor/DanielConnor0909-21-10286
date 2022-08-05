/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import clase.ClienteModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC GAMING
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class ClienteControl extends HttpServlet {
ClienteModel cliente;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
             cliente=new ClienteModel(); 
             cliente.setNombre(request.getParameter("nombre"));
             cliente.setApellido(request.getParameter("apellido"));
             cliente.setCodigo(request.getParameter("codigo"));
             cliente.setNumero(request.getParameter("numero"));
             cliente.setCorreo(request.getParameter("correo"));
             cliente.setContraseña(request.getParameter("contraseña"));
              cliente.setDireccion(request.getParameter("direccion"));
             out.print("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n" +
"          <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>");
             
             out.print(" <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\">");
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CLIENTES</title>");   
            out.println("</head>");
            out.print("<div class=\"container\">");
            out.println("<body>");
            out.println("<h1> CLIENTES  " + "</h1>");
            out.println("<h3>"  +"Nombre " + cliente.getCodigo()+ "</h3>");
            out.println("<h3>"  +"Nombre " + cliente.getNombre() + "</h3>");
            out.println("<h3>"  +"Apellido: " + cliente.getApellido()+ "</h3>");
             out.println("<h3>" +"Numero: " + cliente.getNumero()+ "</h3>");
              out.println("<h3>" +"Direccion: " + cliente.getDireccion()+ "</h3>");
              out.println("<h3>" +"Correo: " + cliente.getCorreo()+ "</h3>");
               out.println("<h3>" +"Contraseña: " + cliente.getContraseña()+ "</h3>");
               out.print("<a class=\"btn btn-primary\" href=\"index.html\" role=\"button\">Registrar  Clientes </a>");
                out.print("<a class=\"btn btn-primary\" href=\"newhtml.html\" role=\"button\">Registrar  Empleado </a>");
                

            out.print("   </div>");
            out.println("</body>");
            out.println("</html>");
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
