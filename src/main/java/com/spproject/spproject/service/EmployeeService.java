package com.spproject.spproject.service;

import com.spproject.spproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Long employeeId);

    Employee save(Employee employee);

    void deleteById(Long id);
}
