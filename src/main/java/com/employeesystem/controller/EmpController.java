package com.employeesystem.controller;

import com.employeesystem.entity.Employee;
import com.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping( {"/", "/home"})
    public String home(Model m){
        List<Employee> emp = employeeService.getAllEmp();
        m.addAttribute("emp",emp);
        return "index";
    }
    @GetMapping(value={"/addemp", "/greeting"})
    public String addEmpPage(){

        return "addemp";
    }



    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session){
        System.out.println(e);
        employeeService.addEmp(e);
        session.setAttribute("mess","Employee added successfully..");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m){
        Employee e = employeeService.getEmpById(id);
        m.addAttribute("emp",e);
        return "edit";
    }
    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Employee e){
        employeeService.addEmp(e);
        return "redirect:/";
    }

}
