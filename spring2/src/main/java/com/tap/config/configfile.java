package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Employee;

@Configuration
public class configfile {

	  @Bean
	  public Employee empI1()
	  {
		  Employee e=new Employee();
		  return e;
	  }
	  @Bean
	  public Employee empI2()
	  {
		  Employee e=new Employee(1,"steve","Steve@gmaol.com",6000);
		  return e;
	  }
}
