package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<student,String>
{
     // save(student)  - new record
    // save(student)  -- update
    // findAll(),findByID(pk) - view or search / report
    // delete(student) -- delete
}
