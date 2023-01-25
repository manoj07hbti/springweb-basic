package com.web.controller;

import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/my_student")
    public String studentData(Model model){

        Student student= new Student("Rahul",1,"CS");

        model.addAttribute("student1",student);

        return "my_student_data";// my_student_data.jsp

    }

}
