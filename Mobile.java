package day8;

class Hey{
	public void addContact(String name, String phoneNumber) {
		System.out.println(name + " " + phoneNumber);
	}
	public void addContact(String name, String phoneNumber, String email) {
		System.out.println(name + " " + phoneNumber + " " + email);
	}
	public void addContact(String name, String phoneNumber, String email, String address) {
		System.out.println(name + " " + phoneNumber + " " + email + " " + address);
	}
	public void addContact(String[] name, String[] phoneNumber) {
		for(int i=0; i<name.length && i<phoneNumber.length; i++) {
			System.out.println(name[i] + " | " + phoneNumber[i]);
		}
	}
}

public class Mobile {
	public static void main(String[] args) {
		
		Hey h = new Hey();
		h.addContact("Aakash", "9876543210");
        h.addContact("Riya", "9876543211", "riya@mail.com");
        h.addContact("Karan", "9876543212", "karan@mail.com", "Bangalore");

        String[] names = {"Sam", "Tina", "John"};
        String[] numbers = {"111111", "2222222", "333333"};
        h.addContact(names, numbers);
		
	}

}
