package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.of;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1L,"sahil",12, LocalDate.of(2000, Month.APRIL,12),"sa"));
		students.add(new Student(1L,"sahil",12, LocalDate.of(2000, Month.APRIL,12),"sa"));
		return students;

	}

}
