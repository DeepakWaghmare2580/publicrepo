package com.example.bookapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity()
public class Reader {
	


	 @Id
    public int readerId ;
	public int transactionId ;
	public String readerName;
	public String issueAt ;
    @ManyToOne(fetch = FetchType.LAZY) 
   
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public book book ;
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public String getIssueAt() {
		return issueAt;
	}
	public void setIssueAt(String issueAt) {
		this.issueAt = issueAt;
	}
	public book getBook() {
		return book;
	}
	public void setBook(book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", transactionId=" + transactionId + ", readerName=" + readerName
				+ ", issueAt=" + issueAt + ", book=" + book + "]";
	}
	public Reader(int readerId, int transactionId, String readerName, String issueAt,
			com.example.bookapp.model.book book) {
		super();
		this.readerId = readerId;
		this.transactionId = transactionId;
		this.readerName = readerName;
		this.issueAt = issueAt;
		this.book = book;
	}
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
   

	

}

