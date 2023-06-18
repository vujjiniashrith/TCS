
package com.mycompany.servlets;

import com.mycompany.dao.ProfDao;
import com.mycompany.dao.StudentDao;
import com.mycompany.entities.Prof;
import com.mycompany.entities.Student;
import com.mycompany.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rohith Rao
 */
public class loginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //coding area
            String email =request.getParameter("email");
            String password = request.getParameter("password");
            
            //user authentication
            StudentDao studentDao =new StudentDao(FactoryProvider.getFactory());
            Student student =studentDao.getUserByEmailAndPassword(email, password);
            //System.out.println(student);
            
            
            
            HttpSession httpSession = request.getSession();
            if(student==null ){
                //out.println("<h1> Invalid details</h1>");
                httpSession.setAttribute("message","Invalid Details");
                response.sendRedirect("login.jsp");
                return;
                
            }
            else {
                //out.println("<h1>Welcome</h1>");
                
                
                //login(we use session to store the login data)
                httpSession.setAttribute("current-student",student);
                
                response.sendRedirect("normal.jsp"); 
               
                
               
               
               
            }
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
