package com.walmart.FirstSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping("/a")
	public String a()
	{
		return "abc...payment controller";
	}

}
