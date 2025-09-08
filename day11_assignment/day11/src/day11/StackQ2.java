package day11;

import java.util.Stack;

public class StackQ2 {
	public static void main(String[] args) {
		Stack<Integer> temperature = new Stack<>();
		temperature.push(30);
		temperature.push(40);
		temperature.push(35);
		temperature.push(65);
		temperature.push(43);
		
		System.out.println(temperature.pop());
		System.out.println(temperature.pop());
		
		System.out.println(temperature.peek());
		
		System.out.println(temperature.isEmpty());
	}

}
