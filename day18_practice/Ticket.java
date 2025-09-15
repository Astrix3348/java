package day18_practice;

import java.io.Serializable;

public class Ticket implements Serializable{

	private static final long serialVersionUID = 1L;
	int id;
	String movieName;
	int seatsBooked;
	float price;
	
	public Ticket(int id, String movieName, int seatsBooked, float price) {
		this.id = id;
		this.movieName = movieName;
		this.seatsBooked = seatsBooked;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", movieName=" + movieName + ", seatsBooked=" + seatsBooked + ", price=" + price
				+ "]";
	}

}
