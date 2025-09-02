package day8;


public class Book {
	int bookId;
	String title;
	String author;
	int price;
	
	
	Book(int bookId, String title, String author, int price) {

		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayBookDetails() {
		System.out.println(bookId + " " + title + " " + author + " " + price);
	}
	
	 
	
	

}
