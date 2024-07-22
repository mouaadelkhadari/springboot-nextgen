package com.spproject.spproject.dao;

import com.spproject.spproject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student readStudent(Long id) {
            return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);

        return typedQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastname) {

        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        typedQuery.setParameter("theData", lastname);

        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

}
