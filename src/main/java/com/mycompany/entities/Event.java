/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;


import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author Rohith Rao
 */
@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private String eventName;
    @Column(length=3000)
    private String eventDiscription;
    private String eventFrom;
    private String eventTo;
    private int recurring;
    private Time eventStart;
    private Time eventEnd;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Prof professor;

    public Prof getProfessor() {
        return professor;
    }

    public void setProfessor(Prof professor) {
        this.professor = professor;
    }

    public Event(String eventName, String eventFrom, String eventTo, Student student, Prof professor) {
        this.eventName = eventName;
        this.eventFrom = eventFrom;
        this.eventTo = eventTo;
        this.student = student;
        this.professor = professor;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDiscription() {
        return eventDiscription;
    }

    public void setEventDiscription(String eventDiscription) {
        this.eventDiscription = eventDiscription;
    }

    public String getEventFrom() {
        return eventFrom;
    }

    public void setEventFrom(String eventFrom) {
        this.eventFrom = eventFrom;
    }

    public String getEventTo() {
        return eventTo;
    }

    public void setEventTo(String eventTo) {
        this.eventTo = eventTo;
    }

    public int getRecurring() {
        return recurring;
    }

    public void setRecurring(int recurring) {
        this.recurring = recurring;
    }

    public Time getEventStart() {
        return eventStart;
    }

    public void setEventStart(Time eventStart) {
        this.eventStart = eventStart;
    }

    public Time getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(Time eventEnd) {
        this.eventEnd = eventEnd;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
    
    
}
