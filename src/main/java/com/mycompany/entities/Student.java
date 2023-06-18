/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ashrith Rao
 */
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String studentMail;
    private String studentPhone;
    private String studentBranch;
    private String studentPassword;
    private String userType;
    @OneToMany(mappedBy = "student" )
    private List<Event> events= new ArrayList<>();

    public Student(int studentId, String studentName, String studentMail, String studentPhone, String studentBranch, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMail = studentMail;
        this.studentPhone = studentPhone;
        this.studentBranch = studentBranch;
        this.studentPassword = studentPassword;
    }

    public Student(String studentName, String studentMail, String studentPhone, String studentBranch, String studentPassword, List<Event> events) {
        this.studentName = studentName;
        this.studentMail = studentMail;
        this.studentPhone = studentPhone;
        this.studentBranch = studentBranch;
        this.studentPassword = studentPassword;
        this.events = events;
    }

    public Student(String studentName, String studentMail, String studentPhone, String studentBranch, String studentPassword) {
        this.studentName = studentName;
        this.studentMail = studentMail;
        this.studentPhone = studentPhone;
        this.studentBranch = studentBranch;
        this.studentPassword = studentPassword;
    }

    public Student(String studentName, String studentMail, String studentPhone, String studentBranch, String studentPassword, String userType) {
        this.studentName = studentName;
        this.studentMail = studentMail;
        this.studentPhone = studentPhone;
        this.studentBranch = studentBranch;
        this.studentPassword = studentPassword;
        this.userType = userType;
    }
    
    

    public Student() {
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentMail=" + studentMail + ", studentPhone=" + studentPhone + ", studentBranch=" + studentBranch + ", studentPassword=" + studentPassword + '}';
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
    

   
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    
    
}
