package day11;

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
		return " Book id: " + bookId + " title : " + title + " author :" + author + " price: " + price;
	}

}

class Test{
	
	HashMap<Integer, Book> h = new HashMap<>();
	Scanner s = new Scanner(System.in);
	Book b;
	
	public HashMap<Integer, Book> addBooks(){
		System.out.println("how many books you want to add?");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			Book b = new Book(s.nextInt(), s.next(), s.next(), s.nextDouble());
			h.put(b.bookId, b);
		}
		return h;
	}
	
	public void getBooks() {
		System.out.println("Enter the book id you want to retrieve");
	    int bid = s.nextInt();
	    System.out.println(h.get(bid));
	}
	
	public void bookIDExists() {
		System.out.println("Enter the ID of the book you want to check exists");
	    int n = s.nextInt();
	    if(h.containsKey(n)) {
	    	System.out.println("Your book does exist");
	    }
	    else {
	    	System.out.println("Your book doesnt exist");
	    }
	}
	
	public void bookExists() {
		System.out.println("Enter the id of the book you want to check exists");
	    int n = s.nextInt();
	    
	    if(h.keySet().contains(n)) {
	    	System.out.println("Your book does exist");
	    }
	    else {
	    	System.out.println("Your book doesnt exist");
	    }
	}
	
	public void display() {
		for(Map.Entry<Integer, Book> m : h.entrySet()) {
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue());
		}
		
	}
	
	public void number() {
		System.out.println("Total number of books are : " + h.size());
	}
	
	public void update() {
		System.out.println("Enter the id of the book whose price you want to update");
	    int id = s.nextInt();
	    
	    System.out.println("What change in price you want to make?");
	    double n = s.nextDouble();
	    @SuppressWarnings("unlikely-arg-type")
		Book book = h.get(n);
	    book.price = n;
	    h.replace(id, book);
	    
	}
	
	public void remove() {
		System.out.println("Enter book id you want to remove");
		int n = s.nextInt();
		h.remove(n);
	}
	
	public void clearBooks() {
		h.clear();
		System.out.println("All books have been removed");
	}
	
	public void empty() {
		if(!h.isEmpty()) {
			System.out.println("The collection is not empty");
		}
		else {
			System.out.println("The collection is empty");
		}
	}
	
	public void iterate() {
		for(Map.Entry<Integer, Book> entry : h.entrySet()) {
			System.out.println(entry.getValue());
		}
	}	
}

