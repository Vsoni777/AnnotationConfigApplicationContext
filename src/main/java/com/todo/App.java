package com.todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.todo.Bean.Coursedetail;
import com.todo.Bean.Student;
import com.todo.config.Appconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new AnnotationConfigApplicationContext(Appconfig.class);
		/*
		 * System.out.println("Primitive data type"); Student
		 * std=(Student)con.getBean("getdata"); System.out.println("Student data"+std);
		 */
    	
    	System.out.println("Collection data type");
    	Coursedetail cu=(Coursedetail)con.getBean("Cdobject");
    	System.out.println(cu);
    	
    }
}
