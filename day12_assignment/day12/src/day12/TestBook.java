package day12;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Method m = new Method();
		Scanner s = new Scanner(System.in);
		int n;
		do {
			
			System.out.println("1--->Add Book");
			System.out.println("2--->Remove Book");
			System.out.println("3--->Display Book");
			System.out.println("4--->Check if the book exists");
			System.out.println("5--->Get the book");
			
			n = s.nextInt();
			
			switch(n) {
			case 1: m.addBook();
				break;
			case 2: m.removeBook();
				break;
			case 3: m.displayBooks();
				break;
			case 4: m.existsBookId();
				break;
			case 5: m.getBook();
				break;
			}
			
		}while(n!=6);
		
		
	}

}
