package com.web.controller;

import com.web.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.print.Doc;

@Controller
public class DemoControllerDay1 {

    @RequestMapping("/demo_web")
    public String demo(){

       return "filename_demo"; // filename_demo.jsp
    }

    @RequestMapping("dyn_page")
    public  String dynamicPage(Model model){

        model.addAttribute("key_1","Java Programming");
        model.addAttribute("key_2","Spring framework");
        model.addAttribute("key_3","Microservices ");

        return "dynamic_data";
    }

    @RequestMapping("/doctor_page")
    public String doctor(Model model){

        Doctor doctor1= new Doctor("Raj",45,"Surgery");

        model.addAttribute("doc",doctor1);
        return "doctor_details";
    }
}
