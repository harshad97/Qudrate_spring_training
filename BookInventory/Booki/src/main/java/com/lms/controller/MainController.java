package com.lms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lms.models.Book;
import com.lms.services.LmsService;

@Controller
public class MainController {
	
	@Autowired
	private LmsService lmsService;
	
	@GetMapping("/")
	public String init(HttpServletRequest req) {
		req.setAttribute("books",lmsService.findAllBooks());
		req.setAttribute("mode","BOOK_VIEW");
		return "index";
	}
	
	@GetMapping("/updateBook")
	public String init(@RequestParam long id,HttpServletRequest req) {
		req.setAttribute("book",lmsService.findOne(id));
		req.setAttribute("mode","BOOK_EDIT");
		return "index";
	}
	 @GetMapping("/save")
	 public String save(@ModelAttribute Book book,HttpServletRequest req) {
		 lmsService.save(book);
		 req.setAttribute("books",lmsService.findAllBooks());
		 req.setAttribute("mode","BOOK_VIEW");
		 
		 return "index";
		 
	 }
	
	
	
	@GetMapping("/newBook")
	public String newBook(HttpServletRequest req ) {
	req.setAttribute("mode","BOOK_NEW");
	return "index";
		
		
	}
	
	
	

}
