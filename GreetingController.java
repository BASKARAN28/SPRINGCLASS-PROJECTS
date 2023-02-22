package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${hello.value}")
	private String welcomeSalutation;
	
	@GetMapping("/values")
	public String home() {
		return welcomeSalutation + ", World!";
	}
}
