package com.spproject.spproject.service;

import com.spproject.spproject.dao.EmployeeDAO;
import com.spproject.spproject.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImp(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
