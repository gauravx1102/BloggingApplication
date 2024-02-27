package com.fulara.blogApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	@GetMapping(path="/me")
	public String hello() {
		return"Hello Everyone how are you I'm starting project in spring boot";
	}
	
	@GetMapping("/aboutUs")
	public String aobut() {
		return"I am an Intern in spring boot framework but I'll be pro one day just wait and watch";
	}

	@GetMapping("/contact")
	public String contact(){
		return "DM me in my mail : fularagaurav1102@gmail.com";
	}

}
