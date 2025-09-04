package day10;

public abstract class Vehicle {
	int vehicleNumber;
	int rentalPrice;
	
	public Vehicle(int vehicleNumber, int rentalPrice) {
	
		this.vehicleNumber = vehicleNumber;
		this.rentalPrice = rentalPrice;
	}
	
	abstract void calculateRent(int days);

}

class Car extends Vehicle{
	
	Car(int vehicleNumber, int rentalPrice){
		super(vehicleNumber, rentalPrice);
	}
	
	public void calculateRent(int days) {
		int rent = days*rentalPrice;
		System.out.println("Car Rent : " + rent);
	}
}

class Bike extends Vehicle{
	
	Bike(int vehicleNumber, int rentalPrice){
		super(vehicleNumber, rentalPrice);
	}
	
	public void calculateRent(int days) {
		int rent = days*rentalPrice;
		System.out.println("Bike Rent : " + rent);
	}
}
