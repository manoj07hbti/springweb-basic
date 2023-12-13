package com.web.controller;

import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController11Dec {

    @RequestMapping("/demo_11dec")
    public String demo(){

        return "demo_11Dec"; // it will look for demo_11Dec.jsp and display in browser
    }

    @RequestMapping("/demo_frontend")
    public String demoFrontEnd(Model model){

        model.addAttribute("test_key","This is my first dynamic value");
        return "frontend"; // it will look for frontend.jsp and display in browser
    }

    @RequestMapping("/student_11dec")
    public String demo(Model model){

        model.addAttribute("first_key","This is my first key for Demo ");
        Student student= new Student("Raj",1,"CS");

        model.addAttribute("second_key",student);

        return "student_11dec";

    }


}
