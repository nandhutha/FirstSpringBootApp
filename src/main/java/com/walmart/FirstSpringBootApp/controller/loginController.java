package com.walmart.FirstSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {
	
	@GetMapping("/hi1")
	public String sayhello()
	{
	return "hello...GooD Day...";
	}

}
