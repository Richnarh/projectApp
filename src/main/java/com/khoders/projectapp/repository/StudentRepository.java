package com.khoders.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khoders.projectapp.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
