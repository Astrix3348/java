package day10;

public interface SmartDevice {
	
	public void turnOn();
	public void turnOff();
	public void getStatus();

}

class Light implements SmartDevice{
	
	int deviceID;
	String status;

	public Light(int deviceID, String status) {
		
		this.deviceID = deviceID;
		this.status = status;
	}

	@Override
	public void turnOn() {
		System.out.println("Light is turned on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Light is turned off");
		
	}

	@Override
	public void getStatus() {
		if(status.equalsIgnoreCase("on")) {
			System.out.println("It is on");
		}
		else {
			System.out.println("It is off");
		}
		
	}
	
}

class Fan implements SmartDevice{
	
	int deviceID;
	String status;

	public Fan(int deviceID, String status) {
		
		this.deviceID = deviceID;
		this.status = status;
	}

	@Override
	public void turnOn() {
		System.out.println("Fan is turned on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is turned off");
		
	}

	@Override
	public void getStatus() {
		if(status.equalsIgnoreCase("on")) {
			System.out.println("It is on");
		}
		else {
			System.out.println("It is off");
		}
		
	}
	
}

