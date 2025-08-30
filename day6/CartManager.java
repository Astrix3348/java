package day6;
import java.util.Scanner;

public class CartManager {
	
	Scanner s = new Scanner(System.in);
	int n;
	
	public void addProduct(Product[] p) {
		Product.cart = true;
		System.out.println("How many Products you want to add : ");
		n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Id");
			System.out.println("Enter Name");
			System.out.println("Enter price");
			System.out.println("Enter Quantity");
			p[i] = new Product(s.nextInt(), s.next(), s.nextInt(), s.nextInt());
		}
	
	}
	
	public void viewProduct(Product[] p) {
		if(Product.cart!=false) {
			Product.cart = true;
		   for(int i=0; i<n; i++) {
			   if(p[i]!=null) {
			   p[i].display();
			   }
		    }
		}	
		else {
			System.out.println("Cart is empty");
		}
	}
	
	
	
	public void updateProduct(Product[] p) {
		if(Product.cart!=false) {
		System.out.println("Which product you want to update");
		System.out.println("Enter Product Id : ");
		int t = s.nextInt();
		
		for(int i=0; i<n; i++) {
			if(t == p[i].productId) {
				System.out.println("What quantity do you wanna change it to? ");
				int updatedQuan = s.nextInt();
				p[i].quantity = updatedQuan;
			}
			else {
				System.out.println("Product not found");
			}
		}	
	}
}
	
	public void deleteProduct(Product[] p) {
		if(Product.cart!=false) {
		System.out.println("Enter Id of the product you want to delete");
		int d = s.nextInt();
		
		for(int i=0; i<n; i++) {
			if(p[i]!=null && p[i].productId == d) {
				for(int j=i; j<n-1; j++) {
					p[j] = p[j+1];
				}
				p[n - 1] = null;
				Product.productCount--;
				System.out.println("Your Product has been removed from the cart");
			}
		}	
	}		
}
	
	public void getBill(Product[] p) {
		if(Product.cart!=false) {
		int total = 0;
		for(int i=0; i<n; i++) {
		    total += (p[i].price) * (p[i].quantity);
		}
		System.out.println("Your total bill would be : " + total);
	    }
		else {
			System.out.println("Cart is Empty");
		}
   }
	
	 public void getCount() {
		 
	    	System.out.println(Product.productCount); 
	    	
		}
}
