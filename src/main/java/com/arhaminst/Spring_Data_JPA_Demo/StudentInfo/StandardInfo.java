package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class StandardInfo
{
    @Id
    private int stdandard;

    @OneToMany
    @JsonIgnore
    List<student> students=new ArrayList<>();


    public void  addStudent(student studentobj)
    {
        this.students.add(studentobj);
    }


    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    public StandardInfo() {
    }

    public StandardInfo(int stdandard) {
        this.stdandard = stdandard;
    }

    public int getStdandard() {
        return stdandard;
    }

    public void setStdandard(int stdandard) {
        this.stdandard = stdandard;
    }
}
