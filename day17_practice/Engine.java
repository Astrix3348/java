package day17_practice;

public class Engine {
	int id;
	float hp;
	String fuel;
	
	public Engine(int id, float hp, String fuel) {
		this.id = id;
		this.hp = hp;
		this.fuel = fuel;
	}
	static boolean start = false;
	
	public void startEngine() {
		start = true;
		System.out.println(start);
	}
	
	public void stopEngine() {
		start = false;
		System.out.println(start);
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", hp=" + hp + ", fuel=" + fuel + "]";
	}
	

}

class Car{
	String brand;
	float price;
	Engine e;
	
	public Car(String brand, float price, Engine e) {
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

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", e=" + e.toString() + "]";
	}
}
