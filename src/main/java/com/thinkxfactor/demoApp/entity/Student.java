package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Long id;

    @Column(name = "id_number")
    private String IdNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    public Student() {
        System.out.println("Student created");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
