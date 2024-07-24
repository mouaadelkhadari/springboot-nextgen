package com.spproject.spproject.rest;

import com.spproject.spproject.dao.EmployeeDAO;
import com.spproject.spproject.entity.Employee;
import com.spproject.spproject.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
