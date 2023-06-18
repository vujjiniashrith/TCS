/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helper;

import com.mycompany.entities.Event;
import com.mycompany.entities.Prof;
import com.mycompany.entities.Student;
import org.hibernate.SessionFactory;
import java.util.Properties;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


public class HybernateUtil {
    private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL,"jdbc:mysql://localhost:3306/oops");
            properties.put(Environment.USER,"root");
            properties.put(Environment.PASS,"Ashrith/333");
            properties.put(Environment.HBM2DDL_AUTO,"update");
            properties.put(Environment.SHOW_SQL,"true");
           
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Event.class);
            configuration.addAnnotatedClass(Prof.class);
            configuration.addAnnotatedClass(Student.class);
            
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
    
}
