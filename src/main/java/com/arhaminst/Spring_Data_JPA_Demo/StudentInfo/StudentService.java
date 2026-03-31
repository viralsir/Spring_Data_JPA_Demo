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
    
   
    public Optional<student> searchstudent(student studentobj){

         return  studentRepo.findById(studentobj.getRollno());
    }

}
