package day6;

class Product1{
	String productName;
	int price;
	
	
	public void showDetails() {
		System.out.println(productName);
		System.out.println(price);
	}
}

class DiscountedProduct extends Product1{
	int discountRate = 5;
	
	DiscountedProduct(String productName, int price){
		this.productName = productName;
		this.price = price;
	}
	
	public void calculateFinalPrice() {
		
		if(price > 100) {
			price -= (price*5)/100;
		}

	}
}

public class Q5 {
	public static void main(String[] args) {
		DiscountedProduct d = new DiscountedProduct("sugar", 200);
		d.calculateFinalPrice();
		d.showDetails();
	}

}
