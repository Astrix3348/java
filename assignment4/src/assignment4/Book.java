package assignment4;

import java.util.Scanner;

public class Book {
	
	 int bookID;
	 String title;
	 int price;
	 boolean isIssued;
	
	
	Book(int bookID, String title, int price){
		this.bookID = bookID;
		this.title = title;
		this.price = price;
		this.isIssued = false;
	
	}
	
	public void display() {
		if(isIssued==false) {
		    System.out.println(title);
	    }
	}
	
	public void issue() {
		if(isIssued==false) {
			isIssued = true;
			System.out.println("Your book " + title + " has been issued.");
		}
		
	}
	
	public void returnBook() {
		if(isIssued == true) {
			isIssued = false;
			System.out.println("Your boook " + title + " has been returned");
		}
		else {
			System.out.println("This book has not been issued yet");
		}
	}
	
	
	   public static void main(String[] args) {
		
		Book[] b = new Book[3];
		b[0] = new Book(1, "Harry Potter", 500);
		b[1] = new Book(2, "Pride & Prejudice", 700);
		b[2] = new Book(3, "Alchemist", 900);
		Scanner myObj = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Display Books -> 1");
			System.out.println("Issue Books -> 2");
			System.out.println("Return Books -> 3");
			System.out.println("Exit -> 4");
			
			choice  = myObj.nextInt();
			
			switch(choice) {
			case 1 : System.out.println("Available books are : ");
			         for(Book books: b) {
			        	 books.display();
			         }
			    break;     
			case 2 : System.out.println("Enter the book Id you want to issue");
				     int n;
				     n = myObj.nextInt();
				     for(Book books: b) {
				    	 if(n==books.bookID) {
				    		 books.issue();
				    	 }
				     }
				break;
			case 3 : System.out.println("Enter the book ID you want to return");
			         int returnId;
			         returnId = myObj.nextInt();
			         for(Book books: b) {
			        	 if(returnId == books.bookID) {
			        		 books.returnBook();
			        	 }
			         }
				break;
				
			case 4 : System.out.println("Exiting System");	
			    break;
			    
			default : System.out.println("Invalid");
			    break;

			}
			
		}while(choice!=4);
		
		myObj.close();
	 }	
  }	

