
package com.mycompany.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
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
public class Prof  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=10, name= "prof_id")
    private int profId;
    @Column(length=100, name= "prof_name")
    private String profName;
    @Column(length=100, name= "prof_email")
    private String profMail;
    @Column(length=100, name= "prof_password")
    private String profPassword;
    @Column(length=12, name= "prof_phone")
    private String profPhone;
    
    @OneToMany(mappedBy= "professor")
    private List<Event> events;

    public Prof(int profId, String profName, String profMail, String profPassword, String profPhone,List<Event>events) {
        this.profId = profId;
        this.profName = profName;
        this.profMail = profMail;
        this.profPassword = profPassword;
        this.profPhone = profPhone;
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Prof(String profName, String profMail, String profPassword, String profPhone) {
        this.events = new ArrayList<>();
        this.profName = profName;
        this.profMail = profMail;
        this.profPassword = profPassword;
        this.profPhone = profPhone;
    }

    public Prof() {
        this.events = new ArrayList<>();
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfMail() {
        return profMail;
    }

    public void setProfMail(String profMail) {
        this.profMail = profMail;
    }

    public String getProfPassword() {
        return profPassword;
    }

    public void setProfPassword(String profPassword) {
        this.profPassword = profPassword;
    }

    public String getProfPhone() {
        return profPhone;
    }

    public void setProfPhone(String profPhone) {
        this.profPhone = profPhone;
    }

    @Override
    public String toString() {
        return "Prof{" + "profId=" + profId + ", profName=" + profName + ", profMail=" + profMail + ", profPassword=" + profPassword + ", profPhone=" + profPhone + '}';
    }
    
   
    
    
    
}
