package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.Config;
import com.tap.pojo.Employee;

public class Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext ad=new AnnotationConfigApplicationContext(Config.class);
        Employee e=(Employee)ad.getBean("emp1");
        System.out.println(e);
	}

}
