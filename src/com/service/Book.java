package com.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private long id;
	private String bookName;
	private double price;
	
	public Book() {}
	
	public Book(long id,String bookName,double price) {
		super();
		this.id=id;
		this.bookName=bookName;
		this.price=price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}
	

}
