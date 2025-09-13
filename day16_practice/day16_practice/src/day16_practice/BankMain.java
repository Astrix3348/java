package day16_practice;

public class BankMain {
	
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1, 200000, 0.07);
		sa.deposit(10000);
		sa.calculateINterest();
	}

}
