package com.student.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.app.model.Student1;
import com.student.app.service.StudentService1;

@Controller
public class StudentController1 {
	@Autowired
	StudentService1 studentService1;

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/registration")
	public String getStudent(Model model) {
		model.addAttribute("student", new Student1());
		return "registration";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String postStudent(Student1 student1) {
		studentService1.saveStudent(student1);
		return "form";
	}
}
