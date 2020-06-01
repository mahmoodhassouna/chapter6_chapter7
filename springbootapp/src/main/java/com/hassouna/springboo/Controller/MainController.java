/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hassouna.springboo.Controller;

import com.hassouna.springboo.Models.course;
import com.hassouna.springboo.Models.student;
import com.hassouna.springbootapp.repostory.RegisterRepostory;
import com.hassouna.springbootapp.repostory.StudentRepostory;
import com.hassouna.springbootapp.repostory.courseRepostory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
    @RestController
public class MainController {
        
        @Autowired
        courseRepostory courseRepostory;
        
           @Autowired
        StudentRepostory studentRepostory;
           
              @Autowired
        RegisterRepostory registerRepostory;
              
    @RequestMapping("/")
    
    public String index(){
        return String.format("%s", "jpa using spring boot");
    }
    
     @RequestMapping("/showall")
    
    public String showall(){
        course  course =courseRepostory.findById(202).get();
        student student1 = new student();
        student1.setName("mahmoud");
        student1.setGrade(90.2);
        student1.setMajor("major");
         studentRepostory.save(student1);
        
      List<student>  student=studentRepostory.findAll();
      String str="";
         for (student e : student) 
               str+=e+"<br>";
                return String.format("%s", str);
         
     }
    
     @RequestMapping("/show/{id}")
    
    public String show(@PathVariable Integer id){
      student  student =studentRepostory.findById(id).get();
     
                return String.format("%s", student);
         
     }
    
}
