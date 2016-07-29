package com.pradeep.mybatis.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String branch;
	private Integer percentage;
	private Integer phone;
	private String email;


	public Student(Integer id, String name, String branch, Integer percentage,
			Integer phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
		this.phone = phone;
		this.email = email;
	}
	
	

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public int getPercentage() {
		return percentage;
	}

	public int getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch
				+ ", percentage=" + percentage + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
