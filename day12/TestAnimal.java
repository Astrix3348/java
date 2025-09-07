package day12;

abstract class Animal{
	int a;

	public abstract void makeSound();
		
}

class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog is barking...");
		
	}
	
}

class Cat extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat is meowing...");
		
	}
	
}

public class TestAnimal {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.makeSound();
		Animal c = new Cat();
		c.makeSound();
	}

}
