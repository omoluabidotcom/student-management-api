package com.example.studentrestapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {

        Optional<Student> optionalStudent = studentRepository.findStudentByMail(student.getMail());

        if (optionalStudent.isPresent()) {

            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    public void removeStudent(Long studentId) {

        if (!studentRepository.existsById(studentId)) {

            throw new IllegalStateException("Student with the " +studentId+ " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

}
