package com.student.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.student.app.model.Student;
import com.student.app.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/registration")
	public String getStudent(Model model) {
		model.addAttribute("student", new Student());
		return "registration";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String postStudent(Student student) {
		studentService.saveStudent(student);
		return "form";
	}

}
