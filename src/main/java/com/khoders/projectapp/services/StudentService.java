package com.khoders.projectapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoders.projectapp.entities.Student;
import com.khoders.projectapp.repository.StudentRepository;

@Service
public class StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> studentList(){
		return studentRepository.findAll();
	}
	
	public Optional<Student> findStudent(Integer id) {
		return studentRepository.findById(id);
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
}
