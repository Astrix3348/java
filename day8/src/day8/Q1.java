package day8;

class Vehicle{
	int vehicleId;
	String brand;
	int rentPerDay;
	
	
	Vehicle(int vehicleId, String brand, int rentPerDay){
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
	
}

class Car extends Vehicle{
	
	
	Car(int vehicleId, String brand, int rentPerDay) {
		super(vehicleId, brand, rentPerDay);
	}

	public void calculateRental(int days) {
		int rent = rentPerDay*days;
		System.out.println(rent);
    }
}

class Bike extends Vehicle{
	
	
	Bike(int vehicleId, String brand, int rentPerDay) {
		super(vehicleId, brand, rentPerDay);
	}

	public void calculateRental(int days) {
		int rent = rentPerDay*days;
		System.out.println(rent);
	}
}

public class Q1 {
	public static void main(String[] args) {
		Car c = new Car(1, "Tata", 800);
		c.calculateRental(10);
		Bike b = new Bike(2, "Yamaha", 400);
		b.calculateRental(15);
		
	}


}
