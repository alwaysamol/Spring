package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired
	private StudentDao dao;
	
	public void saveStudent(Student stu) {
		
		System.out.println("Student in Service:"+stu);
		dao.saveStudent(stu);
	}


	public List<Student> loginCheck(String username, String password) {
		
		   if(username.equals("admin") && password.equals("1234"))
		   {
			   return dao.getAllStudent();
		   }
		   else
		   {
			   return new ArrayList<Student>();
		   }
	}


	public List<Student> deleteById(int sid) {
	
		return dao.deleteById(sid);
	}


	public Student getStudentById(int sid) {
		
		return dao.getStudentById(sid);
	}


	public List<Student> updateStudent(Student stu) {
		
		return dao.updateStudent(stu);
	}


	public List<Student> searchData(String record) {
		
		return dao.searchData(record);
	}


	public List<Student> refreshPage() {
		return dao.getAllStudent();	}
}