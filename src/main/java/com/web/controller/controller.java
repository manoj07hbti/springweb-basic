package com.web.controller;


import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class controller {

    @RequestMapping("/")
    public String defaultMapping(){

        return "index"; // returning index.jsp for view
    }


    @RequestMapping(value = "/hello",method = POST)
    public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("USER_ID", name);  // key and value

        Student student=new Student("Rahul",12,"Computer science");

        model.addAttribute("Student",student);// key and value

        return "hello";// returning hello.jsp view name


    }



}
