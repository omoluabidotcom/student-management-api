package com.example.studentrestapi.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_Name",
            sequenceName = "student_Name",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_Name"
    )
    private Long id;
    private String name;
    private String mail;
    private LocalDate dob;
    @Transient
    private int age;

    public Student() {
    }

    public Student(
            Long id,
            String name,
            String mail,
            LocalDate dob)
    {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.dob = dob;
    }

    public Student(
            String name,
            String mail,
            LocalDate dob)
    {
        this.name = name;
        this.mail = mail;
        this.dob = dob;
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
        return Period.between(dob, LocalDate.now()).getYears();
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
