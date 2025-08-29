package assignment4;
import java.util.Scanner;

public class Product {
	
	static int productId;
	static String productName;
	static int price;
	static int quantity;
	
	Product(int productId, String productName, int price, int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public static void display() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
		
	}
	
	public static int total(int price, int quantity) {
		int amount = (price*quantity);
		
		return amount;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of products you want: ");
		Scanner myObj = new Scanner(System.in);
		n = myObj.nextInt();
		
		Product[] p = new Product[n];
		int grandTotal = 0;
		for(int i=0; i<n; i++) {
			System.out.println("Enter details of product: " + (i+1));
			//p[i] = new Product(myObj.nextInt(), myObj.next(), myObj.nextInt(), myObj.nextInt());
			System.out.print("Enter Product ID : ");
			productId = myObj.nextInt();
			System.out.print("Enter Product name : ");
			productName = myObj.next();
			System.out.print("Enter Product price : ");
			price = myObj.nextInt();
			System.out.print("Enter Product quantity : ");
			quantity = myObj.nextInt();
			
			p[i] = new Product(productId, productName, price, quantity);
			grandTotal += p[i].total(price, quantity);
			p[i].display();
		}
		
		System.out.print("Your total is : ");
		System.out.println(grandTotal);
					
	}


	

}
