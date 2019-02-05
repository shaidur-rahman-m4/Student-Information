package com.student.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.app.model.Student2;
import com.student.app.repo.Student2Repository;

@Service
public class Student2Service {
	@Autowired
	Student2Repository student2Repository;

	public Student2 saveNewStudent(Student2 student2) {
		return student2Repository.save(student2);
	}

	public Student2 findOneStudent(Long id) {
		return student2Repository.getOne(id);
	}

	public List<Student2> findStudents() {
		return student2Repository.findAll();
	}

	public Student2 updateStudent(Student2 student2) {
		return saveNewStudent(student2);
	}

	public void deleteStudentById(Long id) {
		student2Repository.deleteById(id);
	}
}
