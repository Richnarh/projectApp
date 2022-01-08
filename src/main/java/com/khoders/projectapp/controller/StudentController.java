package com.khoders.projectapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import com.khoders.projectapp.entities.Student;
import com.khoders.projectapp.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("student")
	public String createAccount(Student student){
		return "student";
	}
	
	@GetMapping("student-list")
	public String getStudents(Model model){
		List<Student> studentList = studentService.studentList();
		model.addAttribute("studentList", studentList);
		
		return "student-list";
	}
}
