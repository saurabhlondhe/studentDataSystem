package com.example.studentsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "profile")
public class StudentProfile {
    private Long prn;
    private String name;
    private String department;
    @Id
    @GeneratedValue
    public Long getPrn() {
        return prn;
    }

    public void setPrn(Long prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
