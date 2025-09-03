package day9;

public class Test {
	
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1, 20000);
		sa.calculateInterest();
		
		FixedDepositAccount fa = new FixedDepositAccount(2, 50000);
		fa.calculateInterest();
	}

}
