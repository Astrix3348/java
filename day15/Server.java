package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(888);
		Socket s = ss.accept();
		
		System.out.println("Connected Client to server");
		
		InputStreamReader ir = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		String cmsg = br.readLine();
		
		//write to the console
		
		System.out.println("message received by client is: " + cmsg);
		
		//server reading from the console
		
		InputStreamReader ir1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(ir1);
		
		System.out.println("enter message for the client");
		String smsg = br1.readLine();
		
		//write to the socket
		
		OutputStream os = s.getOutputStream();
		PrintStream pr = new PrintStream(os);
		
		pr.println(smsg);
		
	}

}
