package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	 public List<Student> findBySidOrNameOrCityOrQualification(int sid, String name, String city, String qualification);
}