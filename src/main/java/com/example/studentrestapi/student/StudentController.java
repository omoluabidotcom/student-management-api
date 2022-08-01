package com.example.studentrestapi.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
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
