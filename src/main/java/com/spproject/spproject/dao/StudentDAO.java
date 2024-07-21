package com.spproject.spproject.dao;

import com.spproject.spproject.entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);


    public Student readStudent(Long id);

    public List<Student> findAll();
}
