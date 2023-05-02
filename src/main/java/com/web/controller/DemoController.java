package com.web.controller;

import org.springframework.stereotype.Controller;
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



}
