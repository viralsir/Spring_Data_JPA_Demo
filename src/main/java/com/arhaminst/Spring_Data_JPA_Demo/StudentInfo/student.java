package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student
{
    @Id
    String rollno;

    String name;
    int maths;
    int science;

    public student() {
    }

    public student(String rollno, String name, int maths, int science) {
        this.rollno = rollno;
        this.name = name;
        this.maths = maths;
        this.science = science;
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
