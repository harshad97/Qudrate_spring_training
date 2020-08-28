package com.lms.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.LmsRepository;

import java.util.Collection;
import com.lms.models.Book;
import java.util.List;
import java.util.Optional;

@Service
public class LmsService {
	
	@Autowired
	private LmsRepository lmsRepository;
	
	public Collection<Book> findAllBooks(){
		List<Book> books = new ArrayList<Book>();
		
		for(Book book : lmsRepository.findAll()) {
			books.add(book);
		}
		return books;
	}
	public void delete(long id) {
		lmsRepository.deleteById(id);
		
	}
	public Book findOne(long id) {
		return ((LmsService) lmsRepository).findOne(id);
	}
	
	public void save(Book book) {
		 lmsRepository.save(book);
	}
	
	
	

}
