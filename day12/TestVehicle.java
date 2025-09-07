package day12;

class Vehicle{
	public void start() {
		System.out.println("Sarting...");
	}
}

class Car extends Vehicle{
	public void start() {
		System.out.println("Your Car is Starting...");
	}
}

class Bike extends Vehicle{
	public void start() {
		System.out.println("Your Bike is Starting...");
	}
}
public class TestVehicle {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		
		Car c = new Car();
		c.start();
		
		Vehicle v = new Vehicle();
		v.start();
	}

}
