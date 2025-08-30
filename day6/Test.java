package day6;

import java.util.Scanner;

class BankAccount {
	int accountNumber;
	int balance;
	
	Scanner s = new Scanner(System.in);
	
	
	public void deposit(){
		System.out.println("Enter the amount you want to deposit");
		double amount = s.nextDouble();
		balance += amount;
		System.out.println("Available balance is :" + balance);
	}
}

class SavingAccount extends BankAccount{
	static int interestRate = 4;;
	
	SavingAccount(int accountNumber, int balance ){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	 
	
	public void calculateInterest() {
		double interest = (balance * interestRate * 2)/100;
		System.out.println("Your interest is : " + interest);
		
	}
}


public class Test {
	
	public static void main(String[] args) {
		SavingAccount sa1 = new SavingAccount(1, 500);
		SavingAccount sa2 = new SavingAccount(2, 1000);
	
		sa1.deposit();
		sa1.calculateInterest();
		sa2.deposit();
		sa2.calculateInterest();
		
	}

}
