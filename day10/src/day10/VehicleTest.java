package day10;

public class VehicleTest {

	public static void main(String[] args) {
		Car c = new Car(1, 2000);
		c.calculateRent(20);
		
		Bike b = new Bike(2, 1000);
		b.calculateRent(10);

	}

}
