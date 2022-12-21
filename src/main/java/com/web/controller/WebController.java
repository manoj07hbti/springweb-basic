package com.web.controller;


import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.jws.WebParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {

    @RequestMapping("/my_java_data")
    public String javaData(Model model){

        model.addAttribute("A","JAVA");
        model.addAttribute("B","JAVA8");
        model.addAttribute("C","Spring boot");

        return "my_java_data"; // my_java_data.jsp

    }

    @RequestMapping("/my_training")
    public String myTraning(){

        return "mytraining"; // mytraining.jsp
    }

    @RequestMapping("/sept_eve_batch")
    public String demoPage(){

        return "sept_evening_batch";// sept_evening_batch.jsp
    }

    @RequestMapping("/8_august_batch")
    public String page(){

        return "8_august_batch"; // 8_august_batch.jsp
    }


    @RequestMapping("/html_with_data")

    public String myData(Model model){

        model.addAttribute("J","JAVA");
        model.addAttribute("S","Spring ");
        model.addAttribute("SB","Spring Boot");
        model.addAttribute("MS","Microservice");

        Student student= new Student("Raj",1,"CS");
        model.addAttribute("student",student);

        return "html_with_data";// return html_with_data.jsp file

    }


    @RequestMapping("/eve_demo")
    public String demoEve(){

        return "evening_demo_file";// return evening_demo_file.jsp
    }

    @RequestMapping("/8_am_page")
    public String mydemopage(){

        return "8_am_demo_file";// return 8_am_demo_file.jsp
    }

    @RequestMapping("/demo_file")
    public String demoFile() {


        return "demo_file";// returning demo_file.jsp for view
    }

    @RequestMapping("/new")
    public String newPage() {


        return "newpage";// returning newpage.jsp for view
    }

    @RequestMapping("/demo")
    public String demo() {


        return "demo_page";// returning demo_page.jsp for view
    }

    @RequestMapping("/home")
    public String defaultMapping() {

        return "index"; // returning index.jsp for view
    }

    @RequestMapping("/mypage")
    public String mypage() {

        return "mypage"; // returning mypage.jsp for view
    }

    @RequestMapping("/filename")
    public String mypageFile() {

        return "filename"; // returning filename.jsp for view
    }


    @RequestMapping(value = "/hello", method = POST)
    public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("user_key", name);  // key and value

        return "hello";// returning hello.jsp view name


    }

    @RequestMapping("/mvc")
    public String myPage(Model model) {

        model.addAttribute("language", "Java");
        model.addAttribute("framework", "Spring and Spring Boot");
        model.addAttribute("cloud", "Pivotal Cloud Foundry");
        model.addAttribute("devops", "JENKINS");

        return "mvcpage"; // mvcpage.jsp
    }

    @RequestMapping("/eve_mvc")
    public String pageWithJava(Model model){

        model.addAttribute("A","This is my first Value for A");
        model.addAttribute("B","This is my second Value for B");
        model.addAttribute("C","This is my third Value for C");

        return "eve_mvcpage";


    }


    @RequestMapping("/student")
    public String demo(Model model) {

        Student student_obj= new Student("Raj",21,"CS");

        model.addAttribute("student",student_obj);

        Student student_obj2= new Student("Rahul",22,"IT");

        model.addAttribute("student2",student_obj2);

       /* model.addAttribute("A", "RAHUL");
        model.addAttribute("B", "Mukesh");
        model.addAttribute("C", "Rohit");*/

        return "student_eve";
    }

    @RequestMapping("/java_data")

    public String dynamicData(Model model){

        model.addAttribute("a","Java");
        model.addAttribute("b","Java 8");
        model.addAttribute("c","Spring and Spring Boot");
        return "java_data";// java_data.jsp
    }

    @RequestMapping("student_data")
    public String studetnInfo(Model model){

        Student obj= new Student("Raj",23,"CIVIL");
        model.addAttribute("std1",obj);
        Student obj1= new Student("Mukesh",12,"CIVIL");
        model.addAttribute("std2",obj1);

        return "student_data";
    }


    @RequestMapping("/training")
    public String courseInfo(Model model){

        model.addAttribute("java","Java Course with core java and Advance java");
        model.addAttribute("spring","Spring Course");
        model.addAttribute("springboot","Spring Boot course....");

        Student student= new Student("Raj",33,"CS");
        model.addAttribute("std",student);

        return "java_course_data";
    }
}
