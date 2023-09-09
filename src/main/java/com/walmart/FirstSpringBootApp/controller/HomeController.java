package com.walmart.FirstSpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {
	
	@GetMapping("/hi")
		public String sayhello()
		{
		//return "hello......";
		return "display";
		}

}
