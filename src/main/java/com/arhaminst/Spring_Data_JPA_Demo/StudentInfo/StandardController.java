package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/std")
public class StandardController
{

    @Autowired
    private StandarService standarService;

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
}
