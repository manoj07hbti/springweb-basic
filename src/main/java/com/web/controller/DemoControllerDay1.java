package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoControllerDay1 {

    @RequestMapping("/demo_web")
    public String demo(){

       return "filename_demo"; // filename_demo.jsp
    }
}
