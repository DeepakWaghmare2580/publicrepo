package com.example.bookapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity()
public class book {
    @Id
	public int id ;
	public String bookName;
	public int bookPrice;
	@JsonIgnore
	@OneToMany(mappedBy ="book")
    public List<Reader> readerList  ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public List<Reader> getReaderList() {
		return readerList;
	}
	public void setReaderList(List<Reader> readerList) {
		this.readerList = readerList;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", readerList=" + readerList
				+ "]";
	}
	public book(int id, String bookName, int bookPrice, List<Reader> readerList) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.readerList = readerList;
	}
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}

