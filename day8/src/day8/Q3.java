package day8;

class BankAccount{
	int accountNumber;
	String holderName;
	int balance;
	
	BankAccount(int accountNumber, String holderName, int balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount{
	
	SavingsAccount(int accountNumber, String holderName, int balance){
		super(accountNumber, holderName, balance);
	}
	public void addInterest(double rate) {
		balance -= (rate*balance)/100;
		System.out.println(balance);
	}
}

class CurrentAccount extends BankAccount{
	
	CurrentAccount(int accountNumber, String holderName, int balance){
		super(accountNumber, holderName, balance);
	}
	public void applyServiceCharge(double charge) {
		balance -= (charge*balance)/100;
		System.out.println(balance);
	}
}

public class Q3 {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1, "aa", 50000);
		s.addInterest(5);
		CurrentAccount c = new CurrentAccount(2, "gg", 70000);
		c.applyServiceCharge(2);
		
	}
	
}


