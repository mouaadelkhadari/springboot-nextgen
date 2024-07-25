package com.spproject.spproject.rest;

import com.spproject.spproject.dao.EmployeeDAO;
import com.spproject.spproject.dao.EmployeeRepository;
import com.spproject.spproject.entity.Employee;
import com.spproject.spproject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private final EmployeeRepository employeeRepository;

    public EmployeeRestController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable Long employeeId) {

        Optional<Employee> result = employeeRepository.findById(employeeId);
        Employee employee = null;
        if(result.isPresent()) {
            employee = result.get();
        }
        else {
            throw new RuntimeException("employeeId not found - " + employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0L);
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable Long employeeId) {
        Optional<Employee> result = employeeRepository.findById(employeeId);
        Employee employee = null;
        if(result.isPresent()) {
            employee = result.get();
        }
        else {
            throw new RuntimeException("Employee Id not found - " + employeeId);
        }
        employeeRepository.deleteById(employeeId);
        return "the employee has deleted with success - " + employeeId;
    }
}
