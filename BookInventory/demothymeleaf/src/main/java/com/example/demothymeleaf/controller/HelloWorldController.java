package com.example.demothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/helloworld")
	public String helloWorldMethod() {
		//returning html page name
		return "helloworld";
	}

}
