package day12;

class Engine{
	int id;
	String ename;
	
	public Engine(int id, String ename) {
		
		this.id = id;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", ename=" + ename + "]";
	}
	
}

class Car1{
	String brand;
	Engine e;
	public Car1(String brand, Engine e) {
	
		this.brand = brand;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Car1 [brand=" + brand + ", e=" + e + "]";
	}
	
	
}

public class TestCar {
	public static void main(String[] args) {
		Engine e = new Engine(1, "fff");
		System.out.println(e.toString());
		
		Car1 c = new Car1("tata", e);
		System.out.println(c.toString());
	}

}
