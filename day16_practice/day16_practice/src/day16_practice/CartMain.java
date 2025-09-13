package day16_practice;

import java.util.Scanner;

public class CartMain {
	public static void main(String[] args) {
		CartItem[] c = new CartItem[10];
		ProductMethod p = new ProductMethod();
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("1-->Add item");
			System.out.println("2-->Remove item");
			System.out.println("3-->Display");
			System.out.println("4-->Total");
			
			n = s.nextInt();
			
			switch(n) {
			case 1:p.addItem(c);
				break;
			case 2:p.removeItem(c);
				break;
			case 3:p.displayItem(c);
				break;
			case 4:p.calculateTotal(c);
				break;
			
			
			}
			
			
			
			
			
		}while(n!=5);
	}

}
