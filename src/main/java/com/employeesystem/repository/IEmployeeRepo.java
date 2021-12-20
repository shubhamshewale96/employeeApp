package com.employeesystem.repository;

import com.employeesystem.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {
}
