package com.employeesystem.service;

import com.employeesystem.entity.Employee;
import com.employeesystem.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IemployeeService{
    @Autowired
    private IEmployeeRepo eRepo;

    public void addEmp(Employee e){

        eRepo.save(e);
    }
    @Override
    public List<Employee> getAllEmp() {
        return eRepo.findAll();
    }


    public Employee getEmpById(int id){
      Optional<Employee> e = eRepo.findById(id);
      if(e.isPresent()){
          return e.get();
        }
        return null;
    }

    public void deleteEmployee(int id){
        eRepo.deleteById(id);
    }


}
