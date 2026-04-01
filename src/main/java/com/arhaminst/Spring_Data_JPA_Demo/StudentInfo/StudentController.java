package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
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

    @GetMapping("/search/name")
    public ArrayList<student> searchStudentByName(@RequestParam("name") String name)
    {
         return studentService.searchbyname(name);
    }

    @GetMapping("/search/name/contain")
    public ArrayList<student> searchStudentByNameContaining(@RequestParam("name") String name)
    {
        return studentService.searchby_Containing_Name(name);
    }

    @GetMapping("/view/maths")
    public ArrayList<student> viewbymathsge(@RequestParam("mark") int mark){
        return studentService.viewStudentByMaths(mark);
    }

    @GetMapping("/view/pass")
    public ArrayList<student> viewbyPass(){
        return studentService.passStudents();
    }

    @GetMapping("/view/fail")
    public ArrayList<student> viewbyFail(){
        return studentService.failStudents();
    }
    @GetMapping("/view/maths/top")
    public ArrayList<student> viewTop3Maths(){
        return studentService.top3Maths();
    }

//    @GetMapping("/view/name/asc")
//    public ArrayList<student> viewAllByNameAsc()
//    {
//        return studentService.viewAllByNameAsc();
//    }

}
