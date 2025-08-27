package cdac;

import java.util.Scanner;

public class q8 {
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner myObj = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			 arr[i] = myObj.nextInt();
		}
		System.out.println(findMax(arr));
	}

}
