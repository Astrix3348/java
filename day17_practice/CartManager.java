package day17_practice;

import java.util.Scanner;

public class CartManager {
	Product[] p = new Product[10];
	Scanner s = new Scanner(System.in);
	int n;
	
	public void addProducts() {
		System.out.println("Enter the number of products to add");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, price, quantity");
			p[i] = new Product(s.nextInt(), s.next(), s.nextFloat(), s.nextInt());
		}
	}
	
	public void display() {
		for(int i=0; i<n; i++) {
			System.out.println(p[i].toString());
		}
	}
	
	public void updateProduct() {
		System.out.println("Enter id");
		int check = s.nextInt();
		System.out.println("What do you wanna update? price/quantity");
		String sCheck = s.next();
		if(sCheck.equalsIgnoreCase("price")) {
			for(int i=0; i<n; i++) {
				if(check==p[i].id) {
					p[i].price += 1000;
				}
			}
		}
		else {
			for(int i=0; i<n; i++) {
				if(check==p[i].id) {
					p[i].quantity += 3;
				}
			}
			
		}
	}
	
	public void deleteProduct() {
		System.out.println("Enter id of Product");
		int check = s.nextInt();
		for(int i=0; i<n; i++) {
			if(p[i]!=null && p[i].id==check) {
				for(int j=i; j<n-1; j++) {
					p[j] = p[j+1];
				}
			}	
		}
		p[n-1] = null;
		n--;
	}
}
