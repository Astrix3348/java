package day16_practice;

public class VehicleMain {
	public static void main(String[] args) {
		Bike b = new Bike(1, 500);
		b.calculateRent(20);
		
		Car c = new Car(2, 1000);
		c.calculateRent(15);
	}

}
