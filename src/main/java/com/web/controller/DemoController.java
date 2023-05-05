package com.web.controller;

import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/welcome")
    public String demo() {

        return "welcome";// welcome.jsp
    }

    @RequestMapping("/secondpage")
    public String mypage() {
        return "secondpage";// secondpage.jsp
    }

    @RequestMapping("/my_training_data")
    public String dynamicData(Model model){

       model.addAttribute("key_1","Java Programming");
       model.addAttribute("key_2","Spring Boot");
       model.addAttribute("key_3","Cloud and Miroservices");

       return "my_training_data";

    }

    @RequestMapping("/student_details")
    public String studentInfo(Model model){

        Student student= new Student("Raj",1,"CS");
        Student student1= new Student("Rohit",2,"IT");
        Student student2= new Student("Jatin",3,"CS");
        model.addAttribute("s1",student);
        model.addAttribute("s2",student1);
        model.addAttribute("s3",student2);

        return "student_details";
    }

}
