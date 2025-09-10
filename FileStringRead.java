package cdac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStringRead {

	public static void main(String[] args) throws IOException 
	{
	     String str = null;
		FileReader fw = new FileReader("dac.txt");
		
		 BufferedReader br = new BufferedReader(fw);
		while((str =br.readLine())!=null)
		{
			System.out.println(str);
		}
		
       		        
		 
		
		
		
		
     
		// read char by char
		
		
//		       int ch; 
//		       
//	       while((ch = fw.read())!=-1)
//		       {
//		       
//		       System.out.print((char)ch);
//		       }
//		       
		       
		       
		       
		
		
	}
	
}
