package day17_practice;

public class Product {
	int id;
	String name;
	float price;
	int quantity;
	
	public Product(int id, String name, float price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}


