package day16_practice;

import java.util.Scanner;

public class CartItem {
	int id;
	String itemName;
	double price;
	int quantity;
	
	public CartItem(int id, String itemName, double price, int quantity) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}

}

class ProductMethod{
	
	Scanner s = new Scanner(System.in);
	
	int n;
	
	public void addItem(CartItem[] c) {
		System.out.println("How many products you want to enter?");
		n = s.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Enter id, name, price, quantity");
			c[i] = new CartItem(s.nextInt(), s.next(), s.nextDouble(), s.nextInt());
		}
	}
	
	public void displayItem(CartItem[] c) {
		for(int i=0; i<n; i++) {
			if(c[i]!=null) {
			   System.out.println(c[i].toString());
			}
		}
	}
	
	public void calculateTotal(CartItem[] c) {
		System.out.println("Enter product id whose total you want to see");
		int check = s.nextInt();
		double total=0;
		for(int i=0; i<n; i++) {
			if(c[i]!= null && check==c[i].id) {
				total = c[i].price * c[i].quantity;
			}
		}
		if(total>1000) {
			total -= 200;
		}
		System.out.println("your total is :" + total);
	}

	public void removeItem(CartItem[] c) {
		System.out.println("Enter what to remove");
		int check = s.nextInt();
		for(int i=0; i<n; i++) {
			if(c[i]!=null && check == c[i].id) {
				for(int j=i; j<n-1;j++) {
					c[j] = c[j+1];
				}
			}
		}
		c[n-1] = null;
		System.out.println("removed");
		
	}
	
}
