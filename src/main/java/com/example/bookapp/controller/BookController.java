package com.example.bookapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.BookappApplication;
import com.example.bookapp.model.Reader;
import com.example.bookapp.model.book;
import com.example.bookapp.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	private BookServiceImpl bookService;

	@GetMapping("/HeathCheck")
	public String HeathCheck(){
		return "Ok";
		
	}
	@GetMapping("/findBookById/{id}")
	
	public ResponseEntity<book> findBookById(@PathVariable ("id") int id){
		
		return new  ResponseEntity<book>(bookService.FindById(id),HttpStatusCode.valueOf(200));	
	}
	@PostMapping("/add")
    public book add(@RequestBody book book){
		
		return bookService.add(book);	
	}
	
    @PutMapping("/updateBook")
    public ResponseEntity<String> update(@RequestBody book book){
		
         if( bookService.updateBook(book)) {
        	 return new ResponseEntity("Book has been updated" ,HttpStatusCode.valueOf(202));
         }
         else {
        	 return new ResponseEntity("There is no book present of given value" ,HttpStatusCode.valueOf(202));
         }
    }
//    @PutMapping("/updateBook")
//    public String update(@RequestBody book book){
//		
// 		return bookService.updateBook(book);	
//    }
	@GetMapping("/findAllReader/{id}")
	public List<Reader> findAllReader(@PathVariable("id") int id) {
		return bookService.findAllReader(id);
		
	}
}
