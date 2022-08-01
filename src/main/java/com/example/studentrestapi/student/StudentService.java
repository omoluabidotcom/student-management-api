package com.example.studentrestapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        List<Student> str = new ArrayList<>();
        Student yahaya = new Student(
                1L,
                "Yahaya",
                "yyahaya222@gmail.com",
                LocalDate.of(1997, Month.JANUARY,23),
                25
        );

        Student yusuf = new Student(
                1L,
                "Yusuf",
                "yusuf222@gmail.com",
                LocalDate.of(1997, Month.JANUARY,23),
                25
        );

        Student omoluabi = new Student(
                1L,
                "Omoluabi",
                "omoluabi222@gmail.com",
                LocalDate.of(1997, Month.JANUARY,23),
                25
        );

        str.add(yahaya);
        str.add(yusuf);
        str.add(omoluabi);
        return str;
    }
}
