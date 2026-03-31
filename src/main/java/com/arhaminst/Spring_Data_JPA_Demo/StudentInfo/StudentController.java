package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController
{

    @Autowired
    StudentService studentService;

    @PostMapping
    public String addStudent(@RequestBody student studentobj)
    {
        return studentService.addStudent(studentobj);
    }

    @GetMapping
    public ArrayList<student> getAllStudents(){
        return studentService.viewStudent();
    }

    @PutMapping
    public String updateStudent(@RequestBody student studentobj){

        return studentService.updateStudent(studentobj);
    }

    @DeleteMapping
    public String deleteStudent(@RequestBody student studentobj){
         return studentService.deleteStudent(studentobj);
    }
    
    @GetMapping("/search")
    public Optional<student> searchstudent(@RequestBody student studentobj){
        
        return studentService.searchstudent(studentobj);
    }

}
