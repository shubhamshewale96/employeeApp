package com.employeesystem.service;

import com.employeesystem.entity.Employee;
import com.employeesystem.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo eRepo;

    public void addEmp(Employee e){

        eRepo.save(e);
    }

    public List<Employee> getAllEmp() {
        return (List<Employee>) eRepo.findAll();
    }
    public Employee getEmpById(int id){
      Optional<Employee> e = eRepo.findById(id);
      if(e.isPresent()){
          return e.get();
        }
        return null;
    }


}
