package day6;

public class Product {
	int productId;
	String productName;
	int price;
	int quantity;
	static int productCount;
	static boolean cart = false;
	
	
	public Product(int productId, String productName, int price, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		productCount++;
		
		
	}
	
    public void display() {
		System.out.println(productId + " " + productName + " " + price + " " + quantity);
	}
}

