package com.example.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.model.Reader;
import com.example.bookapp.model.book;
import com.example.bookapp.reposistory.BookReposistory;
import com.example.bookapp.service.ReaderServiceImpl;
@RestController
public class ReaderController {
    @Autowired
    public BookReposistory bs ;
	@Autowired
	public ReaderServiceImpl rs;
//	@GetMapping("/getAllReader")
//	public List<Reader> getAllReader(){
//		return rs.getAllReader();
//	}
//		@PostMapping("/addReaer/{bid}")
//	    public ResponseEntity<?> add(@RequestBody Reader r, @PathVariable("bid")int id){
//	    	
//	    	book b = new book();
//	    	b = bs.findById(id).get();
//	    	if(b !=null)
//	    	b.setReaderName(r.getReaderName());
//	    	 if(bs.saveAndFlush(b)== null && rs.addReader(r,id))
//	    		 {
//	          return new ResponseEntity<Reader>(r, HttpStatus.CREATED);
//	    	 }
//	    
//	    	 return new ResponseEntity<>("Book reader name cannot be added", HttpStatus.INTERNAL_SERVER_ERROR);
//			
//			
//		}
//		@DeleteMapping("/deleteAllreaderOfBook/{id}")
//			
//			public ResponseEntity<?> deleteAllreaderOfBook(@PathVariable ("id") int bookid){
//			
//			rs.deleteAllreaderOfBook(bookid) ;
//		 return new ResponseEntity<>("reader has been deleted" , HttpStatus.ACCEPTED);
//				
//			}
			
	@GetMapping("/getAllReader")
	public List<Reader> getAllReader(){
		return rs.getAllReader();
	}
	@PostMapping("/addReaer")
public String  add(@RequestBody Reader r){
	if(rs.addReader(r) == null) {
		return "reader can't created";
	}
	else {
		return "Reader has been created ";
	}
		
	}
		
	
}
