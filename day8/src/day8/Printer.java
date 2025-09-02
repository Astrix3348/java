package day8;

class New1{
	public void print(String s) {
		System.out.println(s);
	}
	public void print(int s) {
		System.out.println(s);
	}
	public void print(double s) {
		System.out.println(s);
	}
	public void print(String[] s) {
		for(String ss : s) {
		   System.out.println(ss);
		}
	}
	
}

public class Printer {
	
	public static void main(String[] args) {
		New1 n = new New1();
	
		n.print("hello");
		n.print(4);
		n.print(4.4);
		String[] t = {"hello", "hey", "no"};
 		n.print(t);
		
		
	}
	
	
	
	

}
