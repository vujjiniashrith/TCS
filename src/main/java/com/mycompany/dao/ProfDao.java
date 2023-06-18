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
public class ProfDao {
    private SessionFactory factory;

    public ProfDao(SessionFactory factory) {
        this.factory = factory;
    }
    // get user by email and password
    public Prof getUserByEmailAndPassword(String email){
        Prof prof = null;
        try{
            
            String query ="from Prof where prof_email =: e";
            Session session = this.factory.openSession();
            Query q = session.createQuery(query);
            q.setParameter("e", email);
            
            
            prof = (Prof) q.uniqueResult();
            
            
            session.close();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        return prof;
    }
}
