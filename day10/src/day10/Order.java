package day10;

public abstract class Order {
	int orderId;
	String customerName;
	int amount;
	
	public Order(int orderId, String customerName, int amount) {
	
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	public abstract void generateInvoice();

}

class OnlineOrder extends Order{
	
	OnlineOrder(int orderId, String customerName, int amount){
		super(orderId, customerName, amount);
	}
	
	public void generateInvoice() {
		amount += amount*0.05;
		System.out.println("ID : " + orderId + ", " + "Name : " + customerName + ", " + "Amount : " + amount);
	}
	
}

class StoreOrder extends Order{
	
	StoreOrder(int orderId, String customerName, int amount){
		super(orderId, customerName, amount);
	}
	
	public void generateInvoice() {
		amount -= amount*0.05;
		System.out.println("ID : " + orderId + ", " + "Name : " + customerName + ", " + "Amount : " + amount);
	}
	
}
