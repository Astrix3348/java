package day6;
import java.util.Scanner;

public class Final {
	
	public static void main(String[] args) {
		CartManager cm = new CartManager();
		Product[] p = new Product[10];
		int n;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1->Add Product");
			System.out.println("2->View Products");
			System.out.println("3->Update Quantity");
			System.out.println("4->Delete any product");
			System.out.println("5->Show how many products are in the cart");
			System.out.println("6->Get the bill");
			System.out.println("7->Exit");
			
			n = s.nextInt();
			
			
			switch(n) {
			case 1: cm.addProduct(p);
			  break;
			case 2: cm.viewProduct(p);
			  break;
			case 3: cm.updateProduct(p);
			  break;
			case 4: cm.deleteProduct(p);
			  break;
			case 5: cm.getCount();
			  break;
			case 6: cm.getBill(p);
			  break;
			}
			
		}while(n!=7);
		
	}

}
