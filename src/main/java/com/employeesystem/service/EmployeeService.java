package com.employeesystem.service;

import com.employeesystem.entity.Employee;
import com.employeesystem.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;
    public void addEmp(Employee e){

        erepo.save(e);
    }
}
