package com.luv2JavaCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luv2JavaCode.Entity.Student;
import com.luv2JavaCode.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1= new Student("Manjul", "Dwivedi", "luv2codes@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("Khushi", "Dwivedi", "khushiluv2codes@gmail.com");
//		studentRepository.save(student2);
	}

}
