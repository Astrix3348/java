package day8;

class Product{

	int productId;
	String name;
	int price;
	
	Product(int productId, String name, int price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
}

class Electronics extends Product{
	
	Electronics(int productId, String name, int price) {
		super(productId, name, price);
	}

	public int applyWarrant(int years) {
		return years;
	}
}

class Clothing extends Product{

	Clothing(int productId, String name, int price) {
		super(productId, name, price);
	}
	
	public void applyDiscount(double percentage) {
		price -= (price*percentage)/100;
		System.out.println(price);
	}
	
}

public class Q4 {
	public static void main(String[] args) {
		Electronics e = new Electronics(1, "Phone", 20000);
		System.out.println("your warranty is");
	    System.out.println(e.applyWarrant(5));
	    
	    Clothing c = new Clothing(2, "Shirt", 1200);
	    c.applyDiscount(2);
	}


}
