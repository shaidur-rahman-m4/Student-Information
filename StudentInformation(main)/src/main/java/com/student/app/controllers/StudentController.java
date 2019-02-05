package com.student.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.student.app.model.Student;
import com.student.app.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/")
	public String loadHomePage() {
		return "home";
	}

	@RequestMapping("/addStudent")
	public String getAddStudent(Model model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}

	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
	public String postAddStudent(Model model, Student student) {
		studentService.saveNewStudent(student);
		model.addAttribute("success", "New Student Created");
		return "addStudent";
	}

	@RequestMapping("/allStudent")
	public String showAllStudent(Model model) {
		model.addAttribute("students", studentService.findStudents());
		return "allStudent";
	}

	@RequestMapping("/editStudent")
	public String getUpdateStudent(@RequestParam(name = "id") Long id, Model model) {
		model.addAttribute("student", studentService.findOneStudent(id));
		return "updateStudent";
	}

	@RequestMapping(value = "updateStudent", method = RequestMethod.POST)
	public String postUpdateStudent(Model model, Student student) {
		studentService.updateStudent(student);
		return "redirect:/allStudent";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam(name = "id") Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/allStudent";
	}
}
