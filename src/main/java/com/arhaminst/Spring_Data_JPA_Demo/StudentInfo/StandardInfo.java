package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StandardInfo
{
    @Id
    private int stdandard;



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
