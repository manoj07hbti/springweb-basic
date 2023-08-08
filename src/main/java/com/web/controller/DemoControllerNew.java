package com.web.controller;

import com.web.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoControllerNew {

    @RequestMapping("/demo_page")
    public String demoPage(){

        return "first_day"; // first_day.jsp
    }


    @RequestMapping("/showdata/{msg}")
    public String showData(Model model, @PathVariable String msg){

        model.addAttribute("test1","Hello This is my first Dynamic web page...");
        model.addAttribute("test2",msg);

        return "showdata";

    }

    @RequestMapping("/doctor")
    public String doctor(Model model){

        Doctor doctor= new Doctor("ABC",34,"BONES");

        model.addAttribute("doc1",doctor);

        return "doctor_data";

    }
}
