package day9;

public class Appliance {
	
	String name;
	int power;
	Appliance(String name, int power) {
	
		this.name = name;
		this.power = power;
	}
	
	public void showConsumption(int hours) {
		int consumption = hours*power;
		System.out.println(consumption);
	}

}

class Fan extends Appliance{
	Fan(String name, int power){
		super(name, power);
	}
	
	@Override
	public void showConsumption(int hours) {
		int consumption = hours*power;
		System.out.println(" Fan " + consumption);
	}
	
}

class AirConditioner extends Appliance{
	AirConditioner(String name, int power){
		super(name, power);
	}
	
	@Override
	public void showConsumption(int hours) {
		int consumption = hours*power;
		System.out.println(" AirConditioner " + consumption);
	}
	
}

class Refrigerator extends Appliance{
	Refrigerator(String name, int power){
		super(name, power);
	}
	
	@Override
	public void showConsumption(int hours) {
		int consumption = hours*power;
		System.out.println(" Refrigerator " + consumption);
	}
	
}
