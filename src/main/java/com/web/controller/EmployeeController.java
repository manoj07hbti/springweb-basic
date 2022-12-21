package com.web.controller;

import com.web.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @RequestMapping("/emp_info")
    public String getEmpInfo(Model model ){

        Employee employee = new Employee("Raj",1,"CS");
       model.addAttribute("emp",employee);

       return "employee"; // employee.jsp

    }

}
