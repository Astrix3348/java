package day8;

public class New {
	
	public static void main(String[] args) {
		Engine e = new Engine(1, 1500, "petrol");
		Car c = new Car("Sx", "tata", 2000, e);
		
		c.displayCarDetails();

	}
	
	
	

}
