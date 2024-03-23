package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebDemoController {

    @RequestMapping("/my_demo")
    public String demo(){

        return "my_demo"; // my_demo.jsp
    }
    @RequestMapping("/my_dynamic_data")
    public String inputData(Model model){

        model.addAttribute("a","Java Programming");
        model.addAttribute("b","Spring Boot framework");
        model.addAttribute("c","Cloud");

        return "my_dynamic_data";//my_dynamic_data.jsp

    }

}
