package day18_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryItem {
	int id;
	String title;
	String author;
	float price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}

class LibraryManager{
	ArrayList<LibraryItem> al = new ArrayList<>();
	
	Scanner s = new Scanner(System.in);
	int n;
	
	public void addBook() {
		System.out.println("How many books to add");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			LibraryItem li = new LibraryItem();
			System.out.println("Enter id, title, author, price");
			int id = s.nextInt();
			li.setId(id);
			String title = s.next();
			li.setTitle(title);
			String author = s.next();
			li.setAuthor(author);
			float price = s.nextFloat();
			li.setPrice(price);
			
			al.add(li);
		}
	}
	
	public void display() {
		for(LibraryItem li : al) {
			System.out.println(li.getId() + li.getTitle() + li.getAuthor() + li.getPrice());
		}
	}
	
	public void update() {
		System.out.println("Enter id");
		int check = s.nextInt();
		System.out.println("Chnage in price?");
		float newPrice = s.nextFloat();
		for(LibraryItem li : al) {
			if(check==li.getId()) {
				li.price = newPrice;
			}
		}
	}
}














