package com.employeesystem.controller;

import com.employeesystem.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {
    @GetMapping( {"/", "/home"})
    public String home(){

        return "index";
    }
    @GetMapping("/addemp")
    public String addEmployee(){

        return "addemp";
    }
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e){
        System.out.println(e);
        return "addemp";
    }
}
