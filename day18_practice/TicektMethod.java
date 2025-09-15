package day18_practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TicektMethod {
	ArrayList<Ticket> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	int n;
	
	public void addTicket() throws IOException {
		FileOutputStream fo = new FileOutputStream("ticket.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("How many tickets you want to add?");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("ENter id, name, seats, price");
			Ticket t = new Ticket(s.nextInt(), s.next(), s.nextInt(), s.nextFloat());
			al.add(t);
			os.writeObject(t);
		}
		os.close();
	}
	
	public void displayTicket() throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("ticket.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Ticket tt;
		
		try {
			while((tt = (Ticket)oi.readObject())!=null) {
				System.out.println(tt.toString());
			}
			
		}catch(EOFException e) {
			
		}
		
		oi.close();
	}
	
	public void revenue() throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("ticket.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Ticket tt;
		float total = 0;
		int highest = 0;
		String highName = null;
		float average = 0;
		int count = 0;
		
		try {
			while((tt = (Ticket)oi.readObject())!=null) {
				average += tt.seatsBooked;
				total += tt.price * tt.seatsBooked;
				count++;
				if(tt.seatsBooked>highest) {
					highest = tt.seatsBooked;
					highName = tt.movieName;
				}
			}
			
		}catch(EOFException e) {
			
		}
		if(count>0) {
			System.out.println("Total revenue is: " + total);
			System.out.println("highest seats booked are for: " + highName);
			System.out.println("Average seats booked are: " + average/count);
			
		}
	}
}
