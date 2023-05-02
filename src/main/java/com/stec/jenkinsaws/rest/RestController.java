package com.stec.jenkinsaws.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("user")
public class RestController {
	
	@GetMapping(value= "username")
	public String getUsername() {
		return "Sagar";
	}
}
