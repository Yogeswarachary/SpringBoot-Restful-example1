package com.springbootrestful.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, path="/getmap")
	public String getPrintMsg() {
		return "hello! Yogesh";
	}
	
	@GetMapping("/justGet")
	public String getPrintMsgs() {
		return "Hello! Yogeswarachary";
	}
	
	@GetMapping("/userdetails")
	public UserDetails getUserDetails() {
		return new UserDetails("Ravindhar", "Bairlampudi", "karnataka");
	}
}
