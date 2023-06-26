package com.example.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.bookapp.model.Reader;
import com.example.bookapp.model.book;
import com.example.bookapp.reposistory.BookReposistory;
import com.example.bookapp.reposistory.ReaderReposistory;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookReposistory bookrepo;
	@Autowired
	private ReaderReposistory readerRepo;

	public book FindById(int id) {

		return bookrepo.findById(id).get();
	}

	public book add(book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	public List<Reader> findAllReader(int id) {
		// TODO Auto-generated method stub
		book b =  bookrepo.findById(id).get();
		return b.getReaderList() ;
	}

	public boolean updateBook(book book) {
		// TODO Auto-generated method stub
		
		if(bookrepo.existsById(book.getId())) {
		    bookrepo.save(book);
		    return true ;
		    }
		else {
			return false ;
		}
		
	}

//@Autowired
//private BookReposistory bookrepo;
//@Autowired
//private ReaderReposistory readerRepo;
//
//
//public ResponseEntity<book> FindById(int id) {
//	// TODO Auto-generated method stub
//	book b=	bookrepo.findById(id).get();
//	ArrayList<Reader> rl = readerRepo.getReaderList(id);
//	b.setReaderList(rl);
//	return  ResponseEntity.ok(bookrepo.findById(id).get());
//}
//
//public ResponseEntity<book> add(book book) {
////	Reader r1 = new Reader();
////	book book3 =bookrepo.save(book);
////	r1.setReaderId(book.getReaderList().get(0).getReaderId());
////	r1.setIssueAt(book.getReaderList().get(0).getIssueAt());
////	r1.setReaderName(book.getReaderList().get(0).getReaderName());
////	r1.setTransactionId(book.getReaderList().get(0).getTransactionId());
////	r1.setBook(book);
////	readerRepo.save(r1);
//	 return  ResponseEntity.ok(bookrepo.save(book));
//}
//
//public String updateBook(book book) {
//	if( !(bookrepo.existsById(book.getId()))) {
//		return "No user exist by given id ";
//	}
//	else {
//	bookrepo.save(book);
//	return "user has been updated";
//	}
//}
//
//public void removeReaderName(int bookid) {
// book b = bookrepo.findById(bookid).get();
// b.setReaderName(null);
// bookrepo.save(b);
	


	

}
