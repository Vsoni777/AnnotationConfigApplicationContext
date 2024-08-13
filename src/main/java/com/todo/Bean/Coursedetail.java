package com.todo.Bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Coursedetail {
	private List<String> course;
	private Set<String> department;
	private Map<Integer,String> c_idtocourse;
	private Properties context;
	public Coursedetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coursedetail(List<String> course, Set<String> department, Map<Integer, String> c_idtocourse,
			Properties context) {
		super();
		this.course = course;
		this.department = department;
		this.c_idtocourse = c_idtocourse;
		this.context = context;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Set<String> getDepartment() {
		return department;
	}
	public void setDepartment(Set<String> department) {
		this.department = department;
	}
	public Map<Integer, String> getC_idtocourse() {
		return c_idtocourse;
	}
	public void setC_idtocourse(Map<Integer, String> c_idtocourse) {
		this.c_idtocourse = c_idtocourse;
	}
	public Properties getContext() {
		return context;
	}
	public void setContext(Properties context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "Coursedetail [course=" + course + ", department=" + department + ", c_idtocourse=" + c_idtocourse
				+ ", context=" + context + "]";
	}
	
	
}
