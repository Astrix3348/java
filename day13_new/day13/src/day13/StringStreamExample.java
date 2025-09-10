package day13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringStreamExample {
	
	public static void main(String[] args) throws IOException  {
		
		FileWriter fw = new FileWriter("Dac.txt");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Write something");
		String str = s.nextLine();
		
		fw.write(str);
		fw.close();
	}

}
