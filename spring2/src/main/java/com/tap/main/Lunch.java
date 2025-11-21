package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.configfile;
import com.tap.pojo.Employee;

public class Lunch {

	    public static void main(String[] args) {
			
	    	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(configfile.class);////to invoke the spring container	
	    	Employee e=(Employee)a.getBean("empI1");
	    	System.out.println(e);
	    	Employee e2=(Employee)a.getBean("empI2");
	    	System.out.println(e2);
		}
}
 