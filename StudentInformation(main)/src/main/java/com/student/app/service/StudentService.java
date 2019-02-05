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

	public Student saveNewStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findOneStudent(Long id) {
		return studentRepository.getOne(id);
	}

	public List<Student> findStudents() {
		return studentRepository.findAll();
	}

	public Student updateStudent(Student student) {
		return saveNewStudent(student);
	}

	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
}
