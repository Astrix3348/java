package day6;
import java.util.Scanner;

class Vehicle{
	 
	 String brand;
	 int fuel;
	 
	 Scanner s = new Scanner(System.in);
	 
	 
	 public void refuel() {
		 int f;
		 System.out.println("How much fuel do you want?");
		 f = s.nextInt();
		 fuel += f;
		 
	 }
	 
 }
 
 class Car extends Vehicle{
	 
	 int mileage;
	 
	 Car( String brand, int fuel, int mileage){
		 this.brand = brand;
		 this.fuel = fuel;
		 this.mileage = mileage;
	 }
	 
	 public void calculateTravelDistance() {
		 int total = (fuel * mileage);
		 System.out.println("Total distance is : ");
		 System.out.println(total);
	 }
	 
	 
 }

public class Q2 {
	public static void main(String[] args) {
		Car c = new Car("Ford", 20, 12);
		c.refuel();
		c.calculateTravelDistance();
	}

}
