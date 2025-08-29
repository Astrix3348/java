package assignment4;

import java.util.Scanner;

public class BankAccount {
	
	int accNumber;
	String name;
	static int balance = 200000;
	
	BankAccount(int accNumber, String name, int balance){
		
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		
	}
	
	public static void deposit(int balance) {
		int n;
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter the amount you need to deposit: ");
	    n = myObj.nextInt();
	    System.out.println("Amount deposited");
	    balance += n;
	    System.out.println("Balance : " + balance);
	    
	}
	
	public static void withdraw(int balance) {
		int n;
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter the amount you need to withdraw: ");
	    n = myObj.nextInt();
	    System.out.println("Amount withdrawn");
	    balance -= n;
	    System.out.println("Balance : " + balance);
	   
	    
	}
	
	public static int checkBalance(int balance) {
		return balance;
	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		BankAccount b;
		
		System.out.println("What do you want to do");
		System.out.println("Press 1 -> deposit");
		System.out.println("Press 2 -> withdraw");
		System.out.println("Press 3 -> check balance");
		
		int ch;
		ch = myObj.nextInt()
;		
		switch(ch) {
		case 1: deposit(balance);
		break;
		
	    case 2: withdraw(balance);
	    break;
	    
	    case 3: checkBalance(balance);
	    break;
	    
	}
		
		
		
		
		
	}

}
