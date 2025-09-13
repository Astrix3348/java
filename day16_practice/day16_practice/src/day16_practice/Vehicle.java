package day16_practice;

public abstract class Vehicle {
	int vehicleNo;
	double rentalPrice;
	
	public Vehicle(int vehicleNo, double rentalPrice) {
		
		this.vehicleNo = vehicleNo;
		this.rentalPrice = rentalPrice;
	}
	
	public abstract void calculateRent(int days);

}

class Bike extends Vehicle{
	
	Bike(int vehicleNo, double rentalPrice){
		super(vehicleNo, rentalPrice);
	}

	@Override
	public void calculateRent(int days) {
		rentalPrice  = rentalPrice*days;
		System.out.println(rentalPrice);
		
	}
	
}

class Car extends Vehicle{
	
	Car(int vehicleNo, double rentalPrice){
		super(vehicleNo, rentalPrice);
	}

	@Override
	public void calculateRent(int days) {
		rentalPrice  = rentalPrice*days;
		System.out.println(rentalPrice);
		
	}
	
}

