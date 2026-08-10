package com.student.app.StudentApp.repo;

import org.springframework.data.repository.CrudRepository;

import com.student.app.StudentApp.Entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer>{

	StudentEntity findById(int sid);
}
