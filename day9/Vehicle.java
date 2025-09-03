package day9;

public class Vehicle {
	String brand;
	int maxSpeed;
	Vehicle(String brand, int maxSpeed) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public void showTopSpeed() {
		System.out.println("Your top speed is : " + maxSpeed);
	}

}

class Car extends Vehicle{
	
	Car(String brand, int maxSpeed){
		super(brand, maxSpeed);
	}
	
	@Override
	public void showTopSpeed() {
		System.out.println("Car top speed is : " + maxSpeed);
	}
}

class Bike extends Vehicle{
	
	Bike(String brand, int maxSpeed){
		super(brand, maxSpeed);
	}
	
	@Override
	public void showTopSpeed() {
		System.out.println("Bike top speed is : " + maxSpeed);
	}
	
}

class Truck extends Vehicle{
	
	Truck(String brand, int maxSpeed){
		super(brand, maxSpeed);
	}
	
	@Override
	public void showTopSpeed() {
		System.out.println("Truck top speed is : " + maxSpeed);
	}
	
}
