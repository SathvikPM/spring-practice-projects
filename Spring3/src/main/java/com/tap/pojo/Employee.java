package com.tap.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //for the class which we have to create object
public class Employee {
     
	   @Value("1") //to insert the data
	   private  int id;
	   @Value("Sathvik") 
	   private String name;
	   @Value("Sathvik@gmail.com")
	   private String email;
	   @Value("1000")
	   private int salary;
	   
	   public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String email, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	  
}
