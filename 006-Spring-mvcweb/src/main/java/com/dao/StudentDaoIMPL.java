package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private SessionFactory factory;

	public void saveStudent(Student stu) {
		System.out.println("Student in Dao:" + stu);
		Session session = factory.openSession();
		session.save(stu);
		session.beginTransaction().commit();

	}

	public List<Student> getAllStudent() {
		Session session = factory.openSession();
		Query q = session.createQuery("from Student");
		return q.getResultList();
	}

	public List<Student> deleteById(int sid) {
		Session session = factory.openSession();
		Student stu = session.get(Student.class, sid);
		session.delete(stu);
		session.beginTransaction().commit();
		return getAllStudent();
	}

	public Student getStudentById(int sid) {
		Session session = factory.openSession();
		Student stu = session.get(Student.class, sid);
		return stu;
	}

	public List<Student> updateStudent(Student stu) {
		Session session = factory.openSession();
		session.update(stu);
		session.beginTransaction().commit();
		return getAllStudent();
	}

	public List<Student> searchData(String record) {
	    Session session = factory.openSession();
	    Query q = session.createQuery("from Student where sid=:sid or name=:name or city=:city or qualification=:qualification");

	    // Check if record is a valid number
	    Integer id = null;
	    try {
	        id = Integer.parseInt(record);
	    } catch (NumberFormatException e) {
	        id = null; // If it's not a number, sid should be null
	    }

	    q.setParameter("sid", id);
	    q.setParameter("name", record);
	    q.setParameter("city", record);
	    q.setParameter("qualification", record);

	    return q.getResultList();
	}


}