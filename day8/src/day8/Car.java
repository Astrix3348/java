package day8;

public class Car {
	String carModel;
	String brand;
	int price;
	Engine e;
	Car(String carModel, String brand, int price, Engine e) {
	
		this.carModel = carModel;
		this.brand = brand;
		this.price = price;
		this.e = e;
		
	}
	
	public void startCar() {
		e.startEngine();
	}
	
	public void stopCar() {
		e.stopEngine();
	}
	
	public void displayCarDetails() {
		System.out.println(carModel + brand + price);
		e.displayEngine();
	}

}
