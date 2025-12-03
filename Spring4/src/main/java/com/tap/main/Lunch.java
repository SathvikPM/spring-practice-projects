package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Lunch {

	public static void main(String[] args) {
		
		String loc="/com/tap/config/applicationContext.xml";
		ApplicationContext c=new ClassPathXmlApplicationContext(loc);
		Employee e=(Employee)c.getBean("emp1");
		System.out.println(e);

	}

}
