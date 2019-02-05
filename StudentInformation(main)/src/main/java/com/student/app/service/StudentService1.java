package com.student.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.model.Student1;
import com.student.app.repo.StudentRepository1;

@Service
public class StudentService1 {

	@Autowired
	StudentRepository1 studentRepository1;

	// Save Student1 in student Database
	public Student1 saveStudent(Student1 student1) {

		return studentRepository1.save(student1);
	}

	public List<Student1> getAllStudent() {
		return studentRepository1.findAll();
	}

	public Student1 findOneStudent(Long id) {
		return studentRepository1.getOne(id);
	}

}
