package day8;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Book[] b = new Book[10];
		Library l = new Library("PPS", "dwarka", b);
		int n;
		do {
		System.out.println("What do you want to do?");
		System.out.println("1-->Add Book");
		System.out.println("2-->Remove Book");
		System.out.println("3-->Show all books");
		System.out.println("4-->Exit");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		switch(n) {
		case 1 : l.addBook(b);
			break;
		case 2 : l.removeBook(b);
			break;
		case 3 : l.showBook(b);
			break;
		} 
		s.close();
	}while(n!=4);
		
	}

}
