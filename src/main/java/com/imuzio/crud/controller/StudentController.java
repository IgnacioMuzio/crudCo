package com.imuzio.crud.controller;

import com.imuzio.crud.model.entity.Student;
import com.imuzio.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll (){
        return studentService.getAll();
    }

    @PostMapping
    public Student create (@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/editar")
    public Student update (@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete (@PathVariable("id")Long id){
        studentService.delete(id);
    }
}
