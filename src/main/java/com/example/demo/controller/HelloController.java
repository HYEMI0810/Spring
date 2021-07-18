package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class HelloController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/hello")
	public String printHello() {
		return "hello";
	}
	
	@GetMapping("/foo")
	public String printFoo() {
		return testService.foo();
	}

}
