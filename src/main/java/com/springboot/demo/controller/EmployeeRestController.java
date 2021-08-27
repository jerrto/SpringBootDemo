package com.springboot.demo.controller;

import com.springboot.demo.model.Employee;
import com.springboot.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    /*
    Field Based DI
     */
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> allEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public String sayHello1(@PathVariable int id) {
        return "Hello world" + LocalDateTime.now();
    }
//
//    @GetMapping("/rs1t")
//    public String sayHello2s() {
//        return "Hello world" + LocalDateTime.now();
//    }
}
