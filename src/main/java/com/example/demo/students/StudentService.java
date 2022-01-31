package com.example.demo.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1L, "sahil", 12, LocalDate.of(2000, Month.APRIL, 12), "sa"));
        students.add(new Student(1L, "sahil", 12, LocalDate.of(2000, Month.APRIL, 12), "sa"));
        students.add(new Student(1L, "sahil", 12, LocalDate.of(2000, Month.APRIL, 12), "sa"));
        students.add(new Student(1L, "sahil", 12, LocalDate.of(2000, Month.APRIL, 12), "sa"));
        students.add(new Student(1L, "sahil", 12, LocalDate.of(2000, Month.APRIL, 12), "sa"));
        return students;

    }
}
