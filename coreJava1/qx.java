package coreJava1;
import java.util.Scanner;
public class qx {
public static void main(String[]args) {
	Scanner myObj = new Scanner(System.in);
	int n1 = myObj.nextInt();
	int n2 = myObj.nextInt();
	int var = (n1>n2)?n1:n2;
	System.out.println(var);
}
}

