package com.student.app.StudentApp.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentEntity() {
		super();
	}

	public StudentEntity(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public StudentEntity(int sid, String name, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
	}
	
	
}
