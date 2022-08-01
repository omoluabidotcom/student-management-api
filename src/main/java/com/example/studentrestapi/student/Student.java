package com.example.studentrestapi.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private String mail;
    private LocalDate dob;
    private int age;

    public Student() {
    }

    public Student(
            Long id,
            String name,
            String mail,
            LocalDate dob,
            int age)
    {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.dob = dob;
        this.age = age;
    }

    public Student(
            String name,
            String mail,
            LocalDate dob,
            int age)
    {
        this.name = name;
        this.mail = mail;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
