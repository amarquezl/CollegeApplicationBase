package com.dao;

import java.util.Collection;

import com.model.Student;

public interface StudentDao {
	Collection<Student> find();
	Student load(Long id);
	Student persist(Student student);
	Student merge(Student student);
	void delete(Long id);
}
