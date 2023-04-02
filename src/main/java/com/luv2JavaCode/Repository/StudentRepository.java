package com.luv2JavaCode.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2JavaCode.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
