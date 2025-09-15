package day18_practice;

import java.io.IOException;

public class TicketMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TicektMethod tm = new TicektMethod();
		tm.addTicket();
		tm.displayTicket();
		tm.revenue();
	}

}
