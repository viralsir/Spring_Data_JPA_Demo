package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import jakarta.persistence.*;

@Entity
// @Table(name="student_info")
public class student
{


    @Id
    String rollno;

    String name;
    int maths;
    int science;

    @ManyToOne
    private  StandardInfo stdandard;;

    public StandardInfo getStdandard() {
        return stdandard;
    }

    public void setStdandard(StandardInfo stdandard) {
        this.stdandard = stdandard;
    }

    public student() {
    }

    public student(String rollno, String name, int maths, int science,StandardInfo standardInfo) {
        this.rollno = rollno;
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.stdandard=standardInfo;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
}
