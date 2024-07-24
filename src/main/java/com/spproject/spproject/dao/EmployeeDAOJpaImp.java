package com.spproject.spproject.dao;


import com.spproject.spproject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImp implements EmployeeDAO {
    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImp(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> typedQuery = entityManager.createQuery("FROM Employee", Employee.class);
        return typedQuery.getResultList();
    }

    @Override
    public Employee findById(Long employeeId) {
        Employee e = entityManager.find(Employee.class, employeeId);
        return e;
    }

    @Override
    public Employee save(Employee employee) {
        Employee e = entityManager.merge(employee);
        return e;
    }

    @Override
    public void deleteById(Long id) {
        Employee e = entityManager.find(Employee.class, id);
        entityManager.remove(e);
    }
}
