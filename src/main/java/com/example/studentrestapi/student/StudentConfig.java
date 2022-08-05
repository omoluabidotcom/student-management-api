package com.example.studentrestapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {

        return args -> {

            List<Student> str = new ArrayList<>();
            Student yahaya = new Student(
                    1L,
                    "Yahaya",
                    "yyahaya222@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,23)
            );

            Student yusuf = new Student(
                    1L,
                    "Yusuf",
                    "yusuf222@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,23)
            );

            Student omoluabi = new Student(
                    1L,
                    "Omoluabi",
                    "omoluabi222@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,23)
            );

            str.add(yahaya);
            str.add(yusuf);
            str.add(omoluabi);

            studentRepository.saveAll(str);
        };
    }
}
