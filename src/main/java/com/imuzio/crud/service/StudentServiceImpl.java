package com.imuzio.crud.service;

import com.imuzio.crud.model.entity.Student;
import com.imuzio.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student save (Student student){
        return studentRepository.save(student);
    }


    public void delete (Long id){
        studentRepository.deleteById(id);
    }
}
