package cdac;

import java.util.Scanner;

public class q9 {
	
	public static void sort(int[] arr) {
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner myObj = new Scanner(System.in);

		for(int i=0; i<5; i++) {
			arr[i] = myObj.nextInt();
		}
		sort(arr);
	}

}
