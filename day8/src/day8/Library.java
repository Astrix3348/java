package day8;

import java.util.Scanner;

public class Library {
	String libraryName;
	String address;
	Book[] b;
	Scanner s = new Scanner(System.in);
	int n;
	
	
    Library(String libraryName, String address, Book[] b) {
		
		this.libraryName = libraryName;
		this.address = address;
		this.b = b;
		
	}
    public void addBook(Book[] b) {
    	System.out.println("How many books you want to add");
    	int n = s.nextInt();
    	for(int i=0; i<n; i++) {
    		b[i] = new Book(s.nextInt(), s.next(), s.next(), s.nextInt());
    	}
    }
    
    public void removeBook(Book[] b) {
    	System.out.println("Enter the id of book you want to remove");
    	int id = s.nextInt();
    	for(int i=0; i<n; i++) {
    		   if(id == b[i].bookId && b[i]!=null) {
    		      for(int j=i; j<n-1; j++) {
    				  b[j] = b[j+1];
    		    }	
    	    }
    		  b[n-1] = null;
    	}
    	
    	System.out.println("Book has been successfully removed");
    }
    
    public void showBook(Book[] b) {
    	for(int i=0; i<n; i++) {
    		if(b[i]!=null) {
    		   b[i].displayBookDetails();
    		}
    	}
    }
  

}
