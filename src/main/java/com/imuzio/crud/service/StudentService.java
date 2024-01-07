package com.imuzio.crud.service;

import com.imuzio.crud.model.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getStudentById(Long id);

    Student save (Student student);

    void delete (Long id);
}
