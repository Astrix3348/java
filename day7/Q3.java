package day7;

class Animal{
	
	Animal(){
		System.out.println("Animal Created...");
	}
}

class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("Dog Created...");
	}
}

public class Q3 {
	public static void main(String[] args) {
		Dog d = new Dog();
	}

}
