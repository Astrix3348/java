package day9;

public class Test3 {
	
	public static void main(String[] args) {
		Car c = new Car("Maruti", 160);
		c.showTopSpeed();
		Bike b = new Bike("Kawasaki", 220);
		b.showTopSpeed();
		Truck t = new Truck("tata", 140);
		t.showTopSpeed();
	}

}
