package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService
{
    @Autowired
    StudentRepo studentRepo;

    public String addStudent(student studentobj)
    {
        studentRepo.save(studentobj);
        return "Record is successfully saved";
    }

    public String updateStudent(student studentobj)
    {
        studentRepo.save(studentobj);
        return "Record successfully updated";
    }

    public ArrayList<student> viewStudent()
    {
        ArrayList<student> studentlist=new ArrayList<>();
        for(student studentobj:studentRepo.findAll())
        {
            studentlist.add(studentobj);
        }

        return studentlist;

    }

    public String deleteStudent(student studentobj){

        studentRepo.delete(studentobj);
        return "Record Deleted Successfully";

    }

    public ArrayList<student> searchbyname(String name){
          ArrayList<student> studentlist=new ArrayList<>();
          for(student studentobj:studentRepo.findByName(name)){
              studentlist.add(studentobj);
          }
          return studentlist;
    }

    public ArrayList<student> searchby_Containing_Name(String name){
        ArrayList<student> studentlist=new ArrayList<>();
        for(student studentobj:studentRepo.findByNameContaining(name)){
            studentlist.add(studentobj);
        }
        return studentlist;
    }
//
//    public ArrayList<student> viewAllByNameAsc(){
//        ArrayList<student> studentlist=new ArrayList<>();
//        for(student studentobj:studentRepo.findOrderByNameAll()){
//            studentlist.add(studentobj);
//        }
//        return studentlist;
//    }
//
    public Optional<student> searchstudent(student studentobj){


         return  studentRepo.findById(studentobj.getRollno());
    }

    public  ArrayList<student> viewStudentByMaths(int marks){

      return  studentRepo.findByMathsGreaterThanOrderByMathsDesc(marks);
    }

    public  ArrayList<student> passStudents(){

        return  studentRepo.findByMathsGreaterThanAndScienceGreaterThan(34,34);
    }
    public  ArrayList<student> failStudents(){

        return  studentRepo.findByMathsLessThanOrScienceLessThan(35,35);
    }

    public  ArrayList<student> top3Maths(){
        return studentRepo.findTop3ByOrderByMathsDesc();
    }
}
