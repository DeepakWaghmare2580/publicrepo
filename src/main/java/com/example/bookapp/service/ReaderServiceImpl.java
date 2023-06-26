package com.example.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookapp.model.Reader;
import com.example.bookapp.reposistory.ReaderReposistory;
@Service
public class ReaderServiceImpl implements Readerservice{

	@Autowired
	ReaderReposistory rp;

	public List<Reader> getAllReader() {
		// TODO Auto-generated method stub
		return rp.findAll();
	}

	public Reader addReader( Reader r ) {
		return rp.save(r);
		
	}
	
	
	
//@Autowired
//BookServiceImpl bk;
//@Autowired
//ReaderReposistory rp;
//	public List<Reader> getAllReader() {
//		// TODO Auto-generated method stub
//		return rp.findAll();
//	}
//	public List<Reader> add(Reader r) {
//		
//		return null;
//	}
//	public boolean addReader(Reader r, int id) {
//		Reader readerObj = new Reader();
//		readerObj.setReaderId(r.getReaderId());
//		readerObj.setReaderName(r.getReaderName());
//		readerObj.setBook_id(id);
//		readerObj.setIssueAt(r.getIssueAt());
//		readerObj.setTransactionId(r.getTransactionId());
//		if(rp.saveAndFlush(readerObj) != null)
//		return true;
//		else 
//			return false ;
//		
//	}
//	public void deleteAllreaderOfBook(int bookid) {
//	       rp.deleteReaderData(bookid);
//	       bk.removeReaderName(bookid);
//		
//	}

}
