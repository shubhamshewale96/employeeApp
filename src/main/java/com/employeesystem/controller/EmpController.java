package com.employeesystem.controller;

import com.employeesystem.entity.Employee;
import com.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping(value={"/addemp", "/greeting"})
    public String addEmpPage(){

        return "addemp";
    }
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e){
        //System.out.println(e);
        employeeService.addEmp(e);
        return "addemp";
    }


}
