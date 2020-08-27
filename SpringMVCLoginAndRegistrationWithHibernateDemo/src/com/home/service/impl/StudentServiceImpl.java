package com.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.StudentDAO;
import com.home.model.Student;
import com.home.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	
	@Override
	public boolean registerStudent(Student student) {
		boolean isRegister=false;
		boolean saveStudent =studentDAO.saveStudent(student);
		if(saveStudent)
			isRegister=true;
		return isRegister;
	}

	@Override
	public Student validateStudentCredential(String email, String password) {
		Student student =studentDAO.getStudentDetailsByEmailAndPassword(email, password);
		return student;
	}
}
