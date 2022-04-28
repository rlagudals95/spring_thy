package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {	
	
	@GetMapping("/")
	public String main() {
		System.out.println("api main!!");	
		return "Diary API0125";
	}
}
