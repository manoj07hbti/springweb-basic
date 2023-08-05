package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoControllerNew {

    @RequestMapping("/demo_page")
    public String demoPage(){

        return "first_day"; // first_day.jsp
    }
}
