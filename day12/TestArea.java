package day12;

class Shape{
	public void area() {
		
	}
}

class Circle extends Shape{
	int r;
	Circle(int r){
		this.r = r;
	}
	public void area(){
		double a = 3.14 * r * r;
		System.out.println("Area of circle is : " + a);
	}
}

class Rec extends Shape{
	int l;
	int b;
	public Rec(int l, int b) {

		this.l = l;
		this.b = b;
	}
	public void area(){
		int a = l*b;
		System.out.println("Area of rectangle is : " + a);
	}
}

public class TestArea {
	public static void main(String[] args) {
		Shape c = new Circle(5);
		c.area();
		Shape r = new Rec(2,3);
		r.area();
	}

}
