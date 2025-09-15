package day18_practice;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Vehicle {
	int id;
	String brand;
	float price;
	
	public Vehicle(int id, String brand, float price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	public abstract void calculateRental(int days);

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
}

class Car extends Vehicle{
	int seatingCapacity;

	Car(int id, String brand, float price, int seatingCapacity) {
		super(id, brand, price);
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public void calculateRental(int days) {
		float total = days * price;
		System.out.println(total);
		
	}
	
}

class Bike extends Vehicle{
	boolean helmet = true;

	public Bike(int id, String brand, float price, boolean helmet) {
		super(id, brand, price);
		this.helmet = helmet;
	}

	@Override
	public void calculateRental(int days) {
		float total = 0;
		if(helmet==true) {
			total = (price*days) - 10;
		}
		else {
			total = price*days;
		}
		System.out.println(total);
		
		
	}
	
}

class VehicleManager{
	ArrayList<Vehicle> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void addVehicle() {
		System.out.println("How many cars you want?");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, brand, price, seating");
			Car c = new Car(s.nextInt(), s.next(), s.nextFloat(), s.nextInt());
			al.add(c);
		}
		
		System.out.println("How many Bikes you want?");
		int newN = s.nextInt();
		for(int i=0; i<newN; i++) {
			System.out.println("Enter id, brand, price, helmetIncluded");
			Bike b = new Bike(s.nextInt(), s.next(), s.nextFloat(), s.nextBoolean());
			al.add(b);
		}
	}
	
	public void display() {
		for(Vehicle v : al) {
			System.out.println(v.toString());
		}
	}
	
	public void rental() {
		System.out.println("Enter id ");
		int check = s.nextInt();
		for(Vehicle v : al) {
			if(v.id==check) {
				v.calculateRental(30);
			}
		}
	}
}












