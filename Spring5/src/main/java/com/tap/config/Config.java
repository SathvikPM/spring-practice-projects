package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Address;
import com.tap.pojo.Employee;

@Configuration
public class Config {

	
	@Bean("Adr1")
	public  Address CreateAbject1() {
		Address ad=new Address();
		ad.setLno(1);
		ad.setCity("banglore");
		ad.setState("Karnataka");
		ad.setCountry("India");
		return  ad;
	
	}
 
	@Bean("emp1")
	 public Employee createObject2() {
		 
		 Employee emp=new Employee();
		 emp.setId(0);
		 emp.setName("Sathvik");
		 emp.setEmail("Sathvik@gmail.com");
		 emp.setSalary("5000");
		 emp.setAdress(CreateAbject1());//setter dependency injection
		 return emp;
	
	 }
	
	//constructor dependency Injection
	@Bean("emp1")
	 public Employee createObject3() {
		 
		 //constructor dependency enjection
		 Employee emp=new Employee(0,"Sathvik","Sathvik@gmail.com","5000",CreateAbject1());
		
		 return emp;
	
	 }
}
