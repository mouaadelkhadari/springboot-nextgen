package com.spproject.spproject.service;

import com.spproject.spproject.dao.EmployeeDAO;
import com.spproject.spproject.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findById(Long employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        employeeDAO.deleteById(id);
    }
}
