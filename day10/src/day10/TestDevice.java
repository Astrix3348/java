package day10;

public class TestDevice {
	
	public static void main(String[] args) {
		Light l = new Light(1, "on");
		l.turnOn();
		l.turnOff();
		l.getStatus();
		
		Fan f = new Fan(1, "OFF");
		f.turnOn();
		f.turnOff();
		f.getStatus();
	}

}
