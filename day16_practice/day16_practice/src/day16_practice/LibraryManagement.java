package day16_practice;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryManagement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner s = new Scanner(System.in);
		int n;
		LibraryMethods lm = new LibraryMethods();
		
		do {
			System.out.println("1-->Insert Books");
			System.out.println("2-->remove Books");
			System.out.println("3-->display Books");
			System.out.println("4-->search Books");
			System.out.println("5-->update Books");
			System.out.println("6-->check availabilty Books");
			
			n = s.nextInt();
			
			switch(n) {
			case 1:lm.insertBooks();
				break;
			case 2:lm.deleteBook();
				break;
			case 3:lm.showBooks();
				break;
			case 4:lm.showById();
				break;
			case 5:lm.updateBook();
				break;
			case 6:lm.checkAvail(10);
				break;
			case 7:System.out.println("GoodBye...");
				break;
				
			}

		}while(n!=7);

	}

}
