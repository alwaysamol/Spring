package com.service;

import java.util.List;

import com.model.Student;
import com.model.User;

public interface StudentService {

	void saveStudent(Student stu);

	List<Student> loginCheck(String username, String password);

	List<Student> deleteById(int sid);

	Student getStudentById(int sid);

	List<Student> updateStudent(Student stu);

	List<Student> searchData(String record);

	List<Student> refreshPage();

	void registerUser(User user);

}