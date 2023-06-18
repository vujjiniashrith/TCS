/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.entities.Prof;
import com.mycompany.entities.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rohith Rao
 */
public class StudentNameDao {
    private SessionFactory factory;

    public StudentNameDao(SessionFactory factory) {
        this.factory = factory;
    }
    // get user by email and password
    public Student getUserByEmailAndPassword(String name){
        Student student = null;
        try{
            
            String query ="from Student where studentName =: n";
            Session session = this.factory.openSession();
            Query q = session.createQuery(query);
            q.setParameter("n", name);
            
            
            student = (Student) q.uniqueResult();
            
            
            session.close();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        return student;
    }
    
    
    
}
