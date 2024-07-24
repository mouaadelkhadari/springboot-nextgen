package com.spproject.spproject.dao;

import com.spproject.spproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(Long employeeId);

    Employee save(Employee employee);

    void deleteById(Long id);


}
