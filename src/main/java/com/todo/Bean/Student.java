package com.todo.Bean;

public class Student {
	
	private int rollno;
	private String std_name;
	private double marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String std_name, double marks) {
		super();
		this.rollno = rollno;
		this.std_name = std_name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", std_name=" + std_name + ", marks=" + marks + "]";
	}
	
}
