package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;
import com.model.User;
import com.repo.UserRepository;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Autowired
	private UserRepository userRepo;

	public void saveStudent(Student stu) {

		System.out.println("Student in Service:" + stu);
		repo.save(stu);
	}

	public List<Student> loginCheck(String username, String password) {

		User user = userRepo.findById(username).get();

		if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			return repo.findAll();
		} else {
			return new ArrayList<Student>();
		}
	}

	public List<Student> deleteById(int sid) {

		repo.deleteById(sid);
		return repo.findAll();
	}

	public Student getStudentById(int sid) {

		return repo.findById(sid).get();
	}

	public List<Student> updateStudent(Student stu) {

		repo.save(stu);
		return repo.findAll();
	}

	public List<Student> searchData(String record) {

		int sid;
		try {
			sid = Integer.parseInt(record);
		} catch (Exception e) {
			sid = 0;
		}

		return repo.findBySidOrNameOrCityOrQualification(sid, record, record, record);
	}

	public List<Student> refreshPage() {
		return repo.findAll();
	}

	@Override
	public void registerUser(User user) {

		userRepo.save(user);
	}
}