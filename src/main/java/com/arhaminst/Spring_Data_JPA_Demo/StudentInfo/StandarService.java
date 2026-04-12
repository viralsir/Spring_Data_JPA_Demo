package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StandarService
{

    @Autowired
    private StandardRepo standardRepo;


    public String AddStandard(StandardInfo standardInfo)
    {
         standardRepo.save(standardInfo);
         return "Record inserted SuccessFully";
    }
    public ArrayList<StandardInfo> viewStandard(){

        ArrayList<StandardInfo> standardInfoArrayList=new ArrayList<>();
        for(StandardInfo standardInfo:standardRepo.findAll())
        {
            standardInfoArrayList.add(standardInfo);
        }

        return standardInfoArrayList;
    }
    
//    public StandardInfo viewStandardById(int id)
//    {
//         standardRepo.findById(id);
//        return byId;
//    }

    public StandardInfo viewStandardByStd(int std)
    {
        return standardRepo.findByStdandard(std);
    }


     public void addStudent(StandardInfo standardInfo){

        standardRepo.save(standardInfo);

     }

     public List<student> viewStudentsByStd(int std)
     {
         return standardRepo.findByStdandard(std).getStudents();
     }
    
}
