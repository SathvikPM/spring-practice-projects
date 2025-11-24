package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.configfile;
import com.tap.pojo.Employee;
import com.tap.pojo.Student;

public class Lunch {

	    public static void main(String[] args) {
			
	    	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(configfile.class);//to invoke the spring container	
	    	Employee e=(Employee)a.getBean(Employee.class);
	    	System.out.println(e);
	    	Student s=(Student)a.getBean(Student.class);
	    	System.out.println(s);
	    	
		}
}
 