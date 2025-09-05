package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	int ticketId;
	String movieName;
	String customerName;
	double price;
	

	public Ticket(int ticketId, String movieName, String customerName, double price) {
		
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.customerName = customerName;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", movieName=" + movieName + ", customerName=" + customerName
				+ ", price=" + price + "]";
	}


}

class TicketMethod{
	ArrayList<Ticket> a = new ArrayList<>();
	int n;
	Scanner s = new Scanner(System.in);
	
	public ArrayList<Ticket> addTicket(){
		System.out.println("How many tickets you want to purchase?");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter ID, movieName, Your name, price");
			Ticket t = new Ticket(s.nextInt(), s.next(), s.next(), s.nextDouble());
	        a.add(t);	
		}
		return a;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void removeTicket() {
		if(!a.isEmpty()) {
			System.out.println("Enter Ticket ID you want to remove");
		    int id = s.nextInt();
		    int pos = 0;
		    for(Ticket t : a) {
		    	if(t.equals(id)) {
		    		pos = a.indexOf(t);
		    	}
		    }
		    a.remove(pos);
		    System.out.println("Successfully removed");
		}
	}	
	
	public void displayTicket() {
		if(!a.isEmpty()) {
			for(Ticket t : a) {
				System.out.println(t.toString());
			}
		}
		else {
			System.out.println("No tickets to display");
		}
	}
	
	public void search() {
		if(!a.isEmpty()) {
			System.out.println("Enter the movie name for which tickets are bought.");
			String movie = s.next();
			for(Ticket t : a) {
				if(t.movieName.equalsIgnoreCase(movie)) {
					System.out.println(t.toString());
				}
			}
		}
		else {
			System.out.println("No tickets found");
		}
	}
	
	public void revenue() {
		if(!a.isEmpty()) {
			double amount = 0;
			System.out.println("Enter the movie name for which prices are to be calculated.");
			String movie = s.next();
			for(Ticket t : a) {
				if(t.movieName.equalsIgnoreCase(movie)) {
					amount += t.price;
				}
			}
			System.out.println("Your total is : " + amount);
		}
		else {
			System.out.println("No tickets found");
		}
	}
	
	public void highestPrice() {
		if(!a.isEmpty()) {
			double max = 0;
			String name = null;
			for(Ticket t : a) {
				if(t.price>max) {
					max = t.price;
					name = t.movieName;
				}
			}
			System.out.println("Highest price ticket is of : " +  name + " " + max);
		}
		else {
			System.out.println("No tickets found");
		}
	}
	
}










