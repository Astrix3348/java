package day7;

class Vehicle{
	public void start() {
		System.out.println("Vehicle is starting....");
	}
}

class Car extends Vehicle{
	//overriding
	public void start() {
		super.start();
		System.out.println("Car starting....");
		
	}
}

class ElectricCar extends Car{
	public void start() {
		super.start();
		System.out.println("Electric car is starting....");
	}
}

public class Q2 {
	public static void main(String[] args) {
		ElectricCar e = new ElectricCar();
		e.start();
	}

}
