package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController11Dec {

    @RequestMapping("/demo_11dec")
    public String demo(){

        return "demo_11Dec"; // it will look for demo_11Dec.jsp and display in browser
    }

    @RequestMapping("/demo_frontend")
    public String demoFrontEnd(){

        return "frontend"; // it will look for frontend.jsp and display in browser
    }


}
