package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("Dac.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
	}

}
