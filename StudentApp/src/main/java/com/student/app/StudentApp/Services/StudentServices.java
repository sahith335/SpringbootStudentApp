package com.student.app.StudentApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.app.StudentApp.Entity.StudentEntity;
import com.student.app.StudentApp.repo.StudentRepo;

@Component
public class StudentServices {

	@Autowired
	StudentRepo sr;

	public List<StudentEntity> bringAllStudent() {
		
		return (List<StudentEntity>) sr.findAll();
		
	}

	public StudentEntity bringOne(int sid) {
		
		return sr.findById(sid);
	}

	public String save(StudentEntity s) {
		sr.save(s);
		return "success";
	}

	public String delete(int sid) {
		StudentEntity se = bringOne(sid);
		sr.delete(se);
		return "success";
	}

	public String update(int sid, StudentEntity se) {
		StudentEntity se1 = bringOne(sid);
		se1.setEmail(se.getEmail());
		sr.save(se1);
		return "success";
	}
	
	
}
