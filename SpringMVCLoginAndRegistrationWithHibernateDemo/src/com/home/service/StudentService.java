package com.home.service;

import com.home.model.Student;

public interface StudentService {
	public Student validateStudentCredential(String email,	String password);
	public boolean registerStudent(Student student);

}