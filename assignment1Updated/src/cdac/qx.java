package cdac;

import java.util.Scanner;

public class qx {
	
	public static void remove(int[] arr) {
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]==arr[j]) {
					arr[i]-= arr[j];
				}
			}
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner myObj = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			arr[i] = myObj.nextInt();
		}
		remove(arr);
	}

}
