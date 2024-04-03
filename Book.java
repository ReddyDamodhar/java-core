package com.learning.core.day1session1;

public class Book {
	
	private String bookTitle;
	
	
	private double bookPprice;
	
	
	public Book(String bookTitle,double bookPrice) {
		this.bookTitle=bookTitle;
		this.bookPprice=bookPrice;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBook_title(String bookTitle){
		this.bookTitle=bookTitle;
	}
	public double getbookPrice() {
		return bookPprice;
	}
	public void setBook_price(double bookPrice ) {
		this.bookPprice=bookPrice;
		
	}
	
	public String toString() {
		double bookPrice = 350;
		return "Book title: " + bookTitle + ", BookPrice: " + bookPrice;
	}
}


