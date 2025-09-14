package day17_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book {
	int id;
	String title;
	String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}

class BookMethod{
	HashMap<Integer, Book> h = new HashMap<>();
	Scanner s = new Scanner(System.in);
	
	public HashMap<Integer, Book> addBook(){
		System.out.println("How many book you want?");
		int n = s.nextInt();
		Book b;
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, title, author");
			b = new Book(s.nextInt(), s.next(), s.next());
			h.put(b.id, b);
		}
		return h;
	}
	
	public void display() {
		for(Map.Entry<Integer, Book> m : h.entrySet()) {
			System.out.println(m.getValue());
		}
		
	}
	
	public void iterateKeySet() {
		for(Integer bb : h.keySet()) {
			System.out.println(bb);
		}
	}
	
	public void updateDetails() {
		System.out.println("Enter Book id");
		int check = s.nextInt();
		
		System.out.println("Enter new title");
		String newTitle = s.next();
		
		Book old = h.get(check);
		Book newBook = new Book(old.id, newTitle, old.author);
		h.replace(check, newBook);
		System.out.println("Changed");
		

	}
	
	public void clearBooks() {
		h.clear();
	}
}
