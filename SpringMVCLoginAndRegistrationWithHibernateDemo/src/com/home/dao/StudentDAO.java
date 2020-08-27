package com.home.dao;

import com.home.model.Student;

public interface StudentDAO {
	public boolean saveStudent(Student student);
	public Student getStudentDetailsByEmailAndPassword(String email,String password);
}
