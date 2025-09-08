package day11;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListQ4 {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.addFirst(120);
		l.addLast(220);
		
		l.remove(3);
		
		for(Integer t : l) {
			System.out.println(t);
		}
		
		System.out.println(l.getFirst() + " " + l.getLast());
		
		System.out.println("Check if exists : ");
		int n = s.nextInt();
		
		System.out.println(l.contains(n));
			
	}

}
