package com.tap.springweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
           //spring web to return onlny normal txt
@RestController
public class HomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("hii");
		return "Hii Welcome";
	}
	@RequestMapping("/about")
	public String about() {
		
		return "I am Sathvik...I am a java devoloper";
	}
	
	@RequestMapping("/Login")
	public String logIn() {
		return "Login page...";
	}
}
