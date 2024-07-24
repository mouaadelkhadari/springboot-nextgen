package com.spproject.spproject.rest;

import com.spproject.spproject.dao.EmployeeDAO;
import com.spproject.spproject.entity.Employee;
import com.spproject.spproject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable Long employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return employee;
    }
}
