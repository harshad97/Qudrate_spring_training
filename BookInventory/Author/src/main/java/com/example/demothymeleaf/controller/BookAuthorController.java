package com.example.demothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookAuthorController {
	
	@RequestMapping(value="/helloworld")
	public String bookAuthorMethod() {
		//returning html page name
		return "BookAuthor";
	}

}
