package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface StudentRepo extends JpaRepository<student,String>
{
     // save(student)  - new record
    // save(student)  -- update
    // findAll(),findByID(pk) - view or search / report
    // delete(student) -- delete

    public ArrayList<student> findByName(String name);
    public ArrayList<student> findByNameContaining(String name);
//    public ArrayList<student> findAllOrderByName();
    public ArrayList<student> findByMathsGreaterThanOrderByMathsDesc(int mark);
    public ArrayList<student> findByMathsGreaterThanAndScienceGreaterThan(int maths_criteria,int science_crietria);
    public ArrayList<student> findByMathsLessThanOrScienceLessThan(int maths_criteria,int science_criteria);
    public ArrayList<student> findTop3ByOrderByMathsDesc();

}
