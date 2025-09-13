package day16_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMethod {
	
	HashMap<Integer, Book> h = new HashMap<>();
	Scanner s = new Scanner(System.in);
	
	public HashMap<Integer, Book> addBook() {
		System.out.println("How many books you want?");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, title, author, price");
			Book b = new Book(s.nextInt(), s.next(), s.next(), s.nextDouble());
			h.put(b.bookId, b);
		}
		return h;
	}
	
	public void checkBook() {
		System.out.println("Enter book id to get");
		int n = s.nextInt();
		System.out.println(h.get(n));
	}
	
	public void countBook() {
		System.out.println("Total books are: " + h.size());
	}
	
	public void usingKeySet() {
		for(int ele : h.keySet()) {
			System.out.println(ele);
		}
	}
	
	public void usingEntrySet() {
		for(Map.Entry<Integer, Book> m : h.entrySet()) {
			System.out.println(m.getValue());
		}
	}
	
	public void updateDetails() {
		
		System.out.println("Enter the id you want to update");
		int check = s.nextInt();
		System.out.println("What change in price you want?");
		double newPrice = s.nextDouble();
		Book oldBook = h.get(check);
		
		Book newBook = new Book(oldBook.bookId, oldBook.title, oldBook.author, newPrice);
        h.replace(check, newBook);
	}
	
	public void clearBooks() {
		System.out.println("do you wanna clear all books?");
		String ans;
		ans = s.next();
		if(ans.equalsIgnoreCase("yes")) {
			h.clear();
			System.out.println("Cleared");
		}
	}
	
	public void removeBook() {
		System.out.println("Enter book id you want to remove");
		int check = s.nextInt();
		Book b = h.get(check);
		
		if(check == b.bookId) {
			h.remove(check);
		    System.out.println("Book removed");
		}
	}
	

}
