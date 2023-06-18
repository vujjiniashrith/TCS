/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.servlets;

import com.mycompany.dao.ProfDao;
import com.mycompany.entities.Event;
import com.mycompany.entities.Prof;
import com.mycompany.entities.Student;
import com.mycompany.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mycompany.dao.StudentDao;
import com.mycompany.dao.StudentNameDao;
import java.time.LocalDate;

/**
 *
 * @author Rohith Rao
 */
public class SaveEvent extends HttpServlet {

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
               String title = request.getParameter("title");
               String endDate = request.getParameter("end_date");
               String startDate = request.getParameter("start_date");
               String prof_mail = request.getParameter("prof_mail");
               String user_name = request.getParameter("student2");
               
//               StudentDao studentDao =new StudentDao(FactoryProvider.getFactory());
//            Student student =studentDao.getUserByEmailAndPassword(email, password);
            
                ProfDao profDao = new ProfDao(FactoryProvider.getFactory());
                Prof prof = profDao.getUserByEmailAndPassword("prof_mail");
                
                StudentNameDao studentNameDao = new StudentNameDao(FactoryProvider.getFactory());
                Student student = studentNameDao.getUserByEmailAndPassword("user_name");
                
            
            
               


               
               
               Event event =new Event(title,startDate,endDate,student,prof);
               
               Session hibernateSession = FactoryProvider.getFactory().openSession();
               Transaction tx = hibernateSession.beginTransaction();
               
               int userID=(int) hibernateSession.save(event);
               
               
               
               tx.commit();
               hibernateSession.close();
               
              
               
               HttpSession httpSession = request.getSession();
               //httpSession.setAttribute("message","Registration Successful!!");
               response.sendRedirect("normal.jsp");
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
