package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.2.93", 888);
		
		
		//read from console
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter message to the server");
		String clientMessage = br.readLine();
		
		//writing to socket
		OutputStream os = s.getOutputStream();
		PrintStream pr = new PrintStream(os);
		pr.println(clientMessage);
		
		//read from socket
		
		InputStreamReader ir = new InputStreamReader(s.getInputStream());
		BufferedReader br1 = new BufferedReader(ir);
		String serverMsg = br1.readLine();
		
		//write to the console
		
		System.out.println(serverMsg);
		
	}

}
