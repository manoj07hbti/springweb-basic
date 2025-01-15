package com.web.controller;

import org.springframework.stereotype.Controller;
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

}
