package com.web.controller;

import com.web.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

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

    @RequestMapping("/emp_data")
    public String employee(Model model){
        // create emp object
        Employee employee= new Employee("Raj",1,"IT");
        model.addAttribute("emp1",employee);

        return "employee_data";// employee_data.jsp
    }


    @RequestMapping("/emp_data_list")
    public String employeeList(Model model){
        // create emp object
        Employee employee1= new Employee("Raj",1,"IT");
        Employee employee2= new Employee("Rahul",2,"IT");
        Employee employee3= new Employee("Mukesh",3,"IT");

        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        model.addAttribute("emp_list",employees);

        return "employee_data_list";// employee_data_list.jsp
    }
}
