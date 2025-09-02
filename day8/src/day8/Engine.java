package day8;

public class Engine {
	int engineNumber;
	int horsePower;
	String fuelType;
	Engine(int engineNumber, int horsePower, String fuelType) {
		
		this.engineNumber = engineNumber;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
	}
	
	public void displayEngine() {
		System.out.println(engineNumber + horsePower + fuelType);
	}
	
	
	public void startEngine()
	{
		System.out.println("Engine is Starting...");
	}
	
	public void stopEngine()
	{
		System.out.println("Engine is Stopping...");
	}
	
	

}
