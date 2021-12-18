package com.employeesystem.repository;

import com.employeesystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository <Employee ,Integer> {
}
