package day11;

import java.util.PriorityQueue;

public class QueueQ3 {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(q.peek());
		
		System.out.println(q.isEmpty());
		
		
	}

}
