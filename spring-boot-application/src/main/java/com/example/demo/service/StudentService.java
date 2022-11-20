package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Ivan", 31, LocalDate.now(), "testmail@test.com"),
                new Student(2L, "Gogo", 31, LocalDate.now(), "tgogo@test.com")
        );
    }
}
