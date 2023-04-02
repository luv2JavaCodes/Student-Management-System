package com.luv2JavaCode.Service;

import java.util.List;

import com.luv2JavaCode.Entity.Student;

public interface StudentService {

// static List<Student> getAllStudents();
	public List<Student> getAllStudents();
	
	public Student svaeStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(Long id); 
	
	
//	public Student  editStudentForm(Student student);
}
