package com.todo.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.todo.Bean.Coursedetail;
import com.todo.Bean.Student;

@Configuration
public class Appconfig {
	@Bean
	public Student getdata() {
		Student std=new Student();
		std.setRollno(101);
		std.setStd_name("vivek");
		std.setMarks(89.6);
		return std;
	}
	@Bean
	public Coursedetail Cdobject() {
		Coursedetail cd=new Coursedetail();
		cd.setCourse(listdata());
		cd.setDepartment(setdata());
		cd.setC_idtocourse(mapdata());
		cd.setContext(propertiesdata());
		return cd;
	}
	
	public List<String> listdata(){
		List<String> co=new ArrayList<String>();
		co.add("Computer science");
		co.add("commerce");
		co.add("Art");
		co.add("Aggerculture");
		return co;
	}
	
	public Set<String> setdata(){
		Set<String> dep=new HashSet<String>();
		dep.add("cs");
		dep.add("Exam");
		dep.add("scholarship");
		return dep;
		
	}
	
	public Map<Integer, String> mapdata(){
		Map<Integer,String> c_idtocourse=new LinkedHashMap<Integer, String>();
		c_idtocourse.put(101, "cs");
		c_idtocourse.put(102, "Exam");
		c_idtocourse.put(302, "scholarship");
		return c_idtocourse;
	}
	
	public Properties propertiesdata() {
		Properties pr=new Properties();
		pr.put(1041, "Bsc");
		pr.put(5024, "Bcom");
		return pr;
	}
}
