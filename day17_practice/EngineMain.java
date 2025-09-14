package day17_practice;

public class EngineMain {
	public static void main(String[] args) {
		Engine e = new Engine(2, 5, "petrol");
		Car c = new Car("tata", 432, e);
		c.startCar();
		c.stopCar();
		System.out.println(c.toString());
	}

}
