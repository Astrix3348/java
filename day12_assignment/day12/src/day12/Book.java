package day12;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Book {
	int bookId; 
	String title;
	String author;
	double price;
	
	public Book(int bookId, String title, String author, double price) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Book book = (Book) obj;
	    return bookId == book.bookId &&
	           Double.compare(book.price, price) == 0 &&
	           title.equals(book.title) &&
	           author.equals(book.author);
	}

	@Override
	public int hashCode() {
	    return java.util.Objects.hash(bookId, title, author, price);
	}

}

class Method{
	HashMap<Integer, Book> h = new HashMap<>();
	Scanner s = new Scanner(System.in);

	
	public HashMap<Integer, Book> addBook(){
		 
		 System.out.println("Enter the number of books you want");
		 int n = s.nextInt();
		 for(int i=0; i<n; i++) {
			 System.out.println("Enter Id, Title, Author, Price");
			 Book b = new Book(s.nextInt(), s.next(), s.next(), s.nextDouble());
			 h.put(b.bookId, b);
		 }
			 
		 return h;
	 }
	 
	 public void getBook() {
		 
		 System.out.println("Enter the book id you want");
		 int n = s.nextInt();
		 System.out.println(h.get(n));
	 }
	 
	 public void existsBookId() {
		 
		 System.out.println("Enter the book ID you want to check");
		 int n = s.nextInt();
		 if(h.containsKey(n)) {
			 System.out.println("Yes it exists");
		 }
		 else {
			 System.out.println("Doesnt exists");
		 }
	 }
	 
	 public void displayBooks() {
		for(Map.Entry<Integer, Book> m : h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	 }
	 
	public void updateDetails() {	
		System.out.println("Enter the id of the book whose price you want to update");
		int id = s.nextInt();
		Book oldBook = h.get(id);
		System.out.println("Enter New Price");
		double newPrice = s.nextDouble();
		
		Book newBook = new Book(oldBook.bookId, oldBook.title, oldBook.author, newPrice);
		h.replace(id, newBook);
		System.out.println("Price has been updated");
		   
	}
	
	 public void removeBook() {
		 System.out.println("Enter the id you want to remove");
		 int id = s.nextInt();
		 h.remove(id);
	 }
	 
	 public void existsBookObject() {
		    System.out.println("Enter Book details to check existence:");
		    System.out.println("ID, Title, Author, Price");
		    int id = s.nextInt();
		    String title = s.next();
		    String author = s.next();
		    double price = s.nextDouble();

		    Book b = new Book(id, title, author, price);

		    if (h.containsValue(b)) {
		        System.out.println("Yes, this book exists in the collection.");
		    } else {
		        System.out.println("No, this book does not exist.");
		    }
		}

	
}
