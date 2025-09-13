package day16_practice;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		BookMethod b = new BookMethod();
		
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("1-->Add Book");
			System.out.println("2-->Remove Book");
			System.out.println("3-->Display using keyset");
			System.out.println("4-->Display using entryset");
			System.out.println("5-->Check Book");
			System.out.println("6-->countBook");
			System.out.println("7-->updateDetails of Book");
			System.out.println("8-->Clear all books");

			
			n = s.nextInt();
			
			switch(n) {
			case 1: b.addBook();
				break;
			case 2:b.removeBook();
				break;
			case 3:b.usingKeySet();
				break;
			case 4:b.usingEntrySet();
				break;
			case 5: b.checkBook();
			    break;
			case 6: b.countBook();
			    break;
			case 7: b.updateDetails();
			    break;
			case 8: b.clearBooks();
			    break;
			case 9 : System.out.println("Goodbye....");
			    break;
			
			}
			
		}while(n!=9);
	
	}

}
