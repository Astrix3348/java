package day16_practice;

public class BankAccount {
	int accNo;
	double balance;
	
	public BankAccount(int accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	

}

class SavingsAccount extends BankAccount{
	
	double rate;
	SavingsAccount(int accNo, double balance, double rate) {
		super(accNo, balance);
		this.rate = rate;
		
	}
	
	public void calculateINterest() {
		balance += balance*0.07;
		System.out.println(balance);
	}
	
}
