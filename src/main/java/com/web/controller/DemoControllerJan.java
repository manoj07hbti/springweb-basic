package com.web.controller;

import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoControllerJan {

    @RequestMapping("/demo_jan")
    public String demoPage(){

        return "jan_demo"; // return jan_demo.jsp
    }

    @RequestMapping("/demo_jan1")
    public String demoPage1(){

        return "jan_demo1"; // return jan_demo.jsp
    }

    //creating a end point which takes dynamic value from method

    @RequestMapping("/demo_jan_dynamic")
    public String dynamic(Model model){

        model.addAttribute("key1","I am Java developer...");
        model.addAttribute("key2","Learning web development with JSP");
        model.addAttribute("key3","I can creat dynamic pages as well...");

        return "jan_dynamic_page";

    }

    @RequestMapping("/jan_student_details")
    public String getStudentDetails(Model model){

        Student student1= new Student("raj",1,"CS");
        model.addAttribute("student1",student1);


        return "jan_student_data";

    }

}
