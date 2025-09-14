package day17_practice;

public class CartMain {
	public static void main(String[] args) {
		CartManager cm = new CartManager();
		cm.addProducts();
		cm.display();
		cm.updateProduct();
		cm.display();
		cm.deleteProduct();
		cm.display();
	}

}
