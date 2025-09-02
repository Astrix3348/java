package day8;

public class Address {
	String city;
	String state;
	int pincode;
	long mobile;
	
	
	Address(String city, String state, int pincode, long mobile) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobile = mobile;
	}

	 void displayAdd() {
		System.out.println(city + " " + state + " " + pincode + " " + mobile);
		
	}

}
