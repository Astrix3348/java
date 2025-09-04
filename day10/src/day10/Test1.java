package day10;

abstract class Bank {
	String bname;
	int balance;
	
	Bank(String bname, int balance){
		this.bname = bname;
		this.balance = balance;
		
	}
	
	abstract void calculateInterest();
}

class SBI extends Bank{

	SBI(String bname, int balance) {
		super(bname, balance);
	}
	
	 public void display() {
		System.out.println(bname + balance);
	}

	@Override
	void calculateInterest() {
		System.out.println(balance + balance*0.07);
		
	}
	
}

public class Test1 {
	public static void main(String[] args) {
		SBI s = new SBI("SBI", 200000);
		s.display();
		s.calculateInterest();
	}

}
