/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hassouna.springboo.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author HP
 */
@Entity
//@NamedQueries({
//    @NamedQuery(name = "Employee.findAll",
//            query = "Select s From Student s"),
//    @NamedQuery(name = "Student.findById",
//            query = "Select e From Student e Where e.id= :id")
//})
public class student implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private  String major;
    private Double grade;
//    @ManyToOne
//    private course_Entity crs;

//    public course_Entity getCrs() {
//        return crs;
//    }
//
//    public void setCrs(course_Entity crs) {
//        this.crs = crs;
//    }

    public student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    
//    public Integer getcourse_id(){
//        return crs.getId();
    
//    }
}
