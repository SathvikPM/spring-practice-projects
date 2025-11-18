package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Lunch {

	public static void main(String[] args) {
		
		String configloc="/com/tap/config/applicationContext.xml";
		//to triger the spring container 
		ApplicationContext context=new ClassPathXmlApplicationContext(configloc);//to invoke the spring container	
		Employee e=(Employee)context.getBean("empI1");//to get the object
		System.out.println(e);
		Employee e2=(Employee)context.getBean("empI2");//to get the object
		System.out.println(e2);
		
		

	}

}
