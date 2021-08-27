package com.springboot.demo.services;

import com.springboot.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public List<Employee> findById(int id);
}
