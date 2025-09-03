package day9;

public class Test4 {
	public static void main(String[] args) {
		Fan f = new Fan("Usha", 400);
		f.showConsumption(8);
		
		AirConditioner a = new AirConditioner("Samsung", 800);
		a.showConsumption(8);
		
		Refrigerator r = new Refrigerator("Usha", 400);
		r.showConsumption(8);
	}

}
