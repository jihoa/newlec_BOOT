package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@GetMapping("/index")
	public String ad() {
		
		return "test";
		
	}
	
	
	@GetMapping("/delete/{variable}")
	public String DeleteVariable(@PathVariable String variable) {
		return variable;
	}
}
