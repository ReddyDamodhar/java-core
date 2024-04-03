package com.learning.core.day1session1;

public class D01P01 {

	public static void main(String[] args) {
		 Book book = new Book("Java programming",350);
		 System.out.println(book.toString()); 
		 
		 Book newBook = creatBook("java Programming",350);
		 
		 showBook(newBook);
	}
	
	
	


		private static Book creatBook(String string, int i) {
	
		return null;
	}





		public static Book createBook(String bookTitle, double bookPrice) {
			 return new Book(bookTitle,bookPrice);
		 }
	
	public static void showBook(Book book) {
		System.out.println(book.toString());
	}

}
