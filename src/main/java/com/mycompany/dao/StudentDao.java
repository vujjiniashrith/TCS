/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.entities.Student;
//import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;


public class StudentDao {
    private SessionFactory factory;

    public StudentDao(SessionFactory factory) {
        this.factory = factory;
    }
    // get user by email and password
    public Student getUserByEmailAndPassword(String email, String password){
        Student student = null;
        try{
            
            String query ="from Student where studentMail =: e and studentPassword=: p";
            Session session = this.factory.openSession();
            Query q = session.createQuery(query);
            q.setParameter("e", email);
            q.setParameter("p", password);
            
            student = (Student) q.uniqueResult();
            
            session.close();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        return student;
    }
    
}
