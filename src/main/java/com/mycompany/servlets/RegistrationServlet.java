/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.servlets;

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
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rohith Rao
 */
public class RegistrationServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try{
               String userName = request.getParameter("user_name");
               String userEmail = request.getParameter("user_email");
               String userPhone = request.getParameter("user_phone");
               String userBranch = request.getParameter("user_branch");
               String userPassword = request.getParameter("user_password");
               String userType = "normal";
               String userRole = request.getParameter("user_role");
               
               if(userName.isEmpty()){
                   out.println("Name is blank ");
                   return ;
               }
               if(userEmail.isEmpty()){
                   out.println("email is blank ");
                   return;
               }
               if(userBranch.isEmpty()){
                   out.println("Branch is blank ");
                   return;
               }
               if(userPhone.isEmpty()){
                   out.println("Phone no is blank ");
                   return;
               }
               if(userPassword.isEmpty()){
                   out.println("Password is blank ");
                   return;
               }
               if (userRole.equals("Professor")){
                    Prof prof =new Prof(userName,userEmail,userPhone,userPassword);
               
                    Session hibernateSession1 = FactoryProvider.getFactory().openSession();
                    Transaction tx1 = hibernateSession1.beginTransaction();
               
                    int userID1=(int) hibernateSession1.save(prof);
               
               
               
                    tx1.commit();
                    hibernateSession1.close();
               
              
               
               
               
               
               }
               
               
               Student user =new Student(userName,userEmail,userPhone,userBranch,userPassword,userType);
               
               Session hibernateSession = FactoryProvider.getFactory().openSession();
               Transaction tx = hibernateSession.beginTransaction();
               
               int userID=(int) hibernateSession.save(user);
               
               
               
               tx.commit();
               hibernateSession.close();
               
              
               
               HttpSession httpSession = request.getSession();
               httpSession.setAttribute("message","Registration Successful!!");
               response.sendRedirect("register.jsp");
               return;
               
               
               
               
           }catch(Exception e){
               e.printStackTrace();
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
