package cdac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStringWrite 
{

	public static void main(String[] args) throws IOException 
	{
		String str = null;
		
		FileWriter fw = new FileWriter("dac.txt");
		
		System.out.println("enter the string for write to dac.txt");
		Scanner sc = new Scanner(System.in);
		
		str =sc.nextLine();
		
		fw.write(str+"\n");
		System.out.println("enter the second line");
		str =sc.nextLine();
		
		fw.write(str);
		
		fw.close();
	
		System.out.println("file write is over");
		
		
		
		
		
		
		
			
		
	} 
	
	
	
}
