package com.student.app.service;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.student.app.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ComponentScan(basePackages = "{com.student.app.*}")
@Rollback(false)
public class StudentServiceTest {

	@Autowired
	StudentService studentService;

	@Test
	public void testSaveNewStudent() {
		Student student = new Student();
		student.setFirstName("Sahidur");
		student.setLastName("Rahman");
		student.setGender("Male");
		student.setHobby("Riding");
		student.setCountry("Bangladesh");
		student.setDateOfBirth(new Date(12,03,1995));
	}

}
