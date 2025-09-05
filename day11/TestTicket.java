package day11;
import java.util.Scanner;

public class TestTicket {
	public static void main(String[] args) {
		TicketMethod tm = new TicketMethod();
		int n;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1-->Add Ticket");
			System.out.println("2-->Remove Ticket");
			System.out.println("3-->Display Ticket");
			System.out.println("4-->Calculate total price of Ticket");
			System.out.println("5-->Show Highest Price Ticket");
			System.out.println("6-->Search tickets by movie name");
			System.out.println("7-->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : tm.addTicket();
				break;
			case 2 : tm.removeTicket();
				break;
			case 3 : tm.displayTicket();
				break;
			case 4 : tm.revenue();
				break;
			case 5 : tm.highestPrice();
				break;
			case 6 : tm.search();
				break;
			}
			
		}while(n!=7);
		
	s.close();
	}

}
