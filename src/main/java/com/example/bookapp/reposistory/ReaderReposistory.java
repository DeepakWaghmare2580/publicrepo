package com.example.bookapp.reposistory;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookapp.model.Reader;

public interface ReaderReposistory extends JpaRepository<Reader, Integer> {
//	 @Query(value="select r from Reader r where r.book_id= :bookId")
//	 public ArrayList<Reader> getReaderList(int bookId);
//	 
//	 @Transactional
//	 @Modifying
//	 @Query(value="delete from Reader where book_id= :bookId")
//	 public void deleteReaderData(int bookId);

}
