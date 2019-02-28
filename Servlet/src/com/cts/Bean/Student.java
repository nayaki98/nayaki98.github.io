package com.cts.Bean;

public class Student {
	private int rno;
	private String name;
	private String dept;
	private String gender;
	public Student()
	{
		
	}
	public Student(int rno, String name, String dept, String gender) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
		this.gender = gender;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return dept;
	}
	public void setDepartment(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
