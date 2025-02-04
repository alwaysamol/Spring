package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	void saveStudent(Student stu);

	List<Student> getAllStudent();

	List<Student> deleteById(int sid);

	Student getStudentById(int sid);

	List<Student> updateStudent(Student stu);

	List<Student> searchData(String record);

}