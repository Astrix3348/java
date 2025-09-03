package day9;

public class BankAccount {
	int accountNumber;
	int balance;
	BankAccount(int accountNumber, int balance) {
	
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void calculateInterest() {
		
		balance -= 0.02*balance;
	}
}

class SavingsAccount extends BankAccount{
	
	
	SavingsAccount(int accountNumber, int balance) {
		super(accountNumber, balance);
	}
    @Override
	public void calculateInterest() {
		balance -= 0.04*balance;
		System.out.println(balance);
	}
}

class FixedDepositAccount extends BankAccount{
	
	FixedDepositAccount(int accountNumber, int balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public void calculateInterest() {
		balance -= balance * 0.07;
		System.out.println(balance);
	}
	
	
}
