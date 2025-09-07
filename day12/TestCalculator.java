package day12;

class BankAccount{
	int accountNo;
	double balance;
	public BankAccount(int accountNo, double balance) {
		
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public void calculateInterest(){
		
		
	}
}

class SavingsAccount extends BankAccount{

	public SavingsAccount(int accountNo, double balance) {
		super(accountNo, balance);
	}
	public void calculateInterest(){
		balance -= balance*0.04;
		System.out.println(balance);
	}
}

class CurrentAccount extends BankAccount{

	public CurrentAccount(int accountNo, double balance) {
		super(accountNo, balance);
	}
	public void calculateInterest(){
		balance -= balance*0.07;
		System.out.println(balance);
	}
}

public class TestCalculator {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(1, 500000);
		ca.calculateInterest();
		
		SavingsAccount sa = new SavingsAccount(1, 500000);
		sa.calculateInterest();
	}

}
