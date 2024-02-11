package com.Library.library.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Library_Collection")
public class LibraryEntity {
	
	@Id
	private int bookid;
	private String bookName;
	private double bookMrp;
	private int availabilty;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookMrp() {
		return bookMrp;
	}
	public void setBookMrp(double bookMrp) {
		this.bookMrp = bookMrp;
	}
	public int getAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(int availabilty) {
		this.availabilty = availabilty;
	}
	
	public LibraryEntity(int bookid, String bookName, double bookMrp, int availabilty) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookMrp = bookMrp;
		this.availabilty = availabilty;
	}
	
	
	
}
