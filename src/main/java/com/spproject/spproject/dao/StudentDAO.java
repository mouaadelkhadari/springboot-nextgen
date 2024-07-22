package com.spproject.spproject.dao;

import com.spproject.spproject.entity.Student;

import java.util.List;

public interface StudentDAO {

     void save(Student student);


     Student readStudent(Long id);

     List<Student> findAll();

     List<Student> findByLastName(String lastname);

     void update(Student student);

     void delete(Long id);



}
