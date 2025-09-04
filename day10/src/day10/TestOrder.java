package day10;

public class TestOrder {
	public static void main(String[] args) {
		OnlineOrder o = new OnlineOrder(1, "Aakash", 1500);
		o.generateInvoice();
		
		StoreOrder s = new StoreOrder(2, "gggg", 1750);
		s.generateInvoice();
	}

}
