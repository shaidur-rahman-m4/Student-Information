package com.student.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.model.Student;
import com.student.app.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	// Save Student in student Database
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Student findOneStudent(Long id) {
		return studentRepository.getOne(id);
	}

}
