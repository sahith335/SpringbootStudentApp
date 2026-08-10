package com.student.app.StudentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.StudentApp.Entity.StudentEntity;
import com.student.app.StudentApp.Services.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices ss;
	
	@GetMapping("/getStudent")
	public List<StudentEntity> getAllStudents()
	{
		return ss.bringAllStudent();
	}
	
	@GetMapping("/getOne/{id}")
	StudentEntity getOne(@PathVariable("id") int sid)
	{
		return ss.bringOne(sid);
	}
	
	@PostMapping("/insert")
	String insert(@RequestBody StudentEntity s)
	{
		return ss.save(s);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteOne(@PathVariable("id") int sid)
	{
		return ss.delete(sid);
	}
	
	@PutMapping("/update/{id}")
	String update(@PathVariable("id") int sid,@RequestBody StudentEntity se)
	{
		return ss.update(sid,se);
	}
}
