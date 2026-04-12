package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/std")
public class StandardController
{

    @Autowired
    private StandarService standarService;

    @Autowired
    private StudentService studentService;

    @PostMapping
     public String addStandard(@RequestBody StandardInfo standardInfo)
     {
          return standarService.AddStandard(standardInfo);
     }

     @GetMapping
    public ArrayList<StandardInfo> viewStandard(){
        return standarService.viewStandard();
     }

     @GetMapping("/search")
    public StandardInfo searchStandard(@RequestParam("std") int std)
     {
         return standarService.viewStandardByStd(std);
     }

    @GetMapping("/{std}/students")
    public List<student> getStudentsByStd(@PathVariable("std") int std){

        // return studentService.viewStudentsByStandard(std);
        return standarService.viewStudentsByStd(std);
     }

}
