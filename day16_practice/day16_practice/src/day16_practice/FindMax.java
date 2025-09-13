package day16_practice;

import java.util.Scanner;

public class FindMax {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
		
		//temp = 7, arr[j]=temp
		int[] arr = new int[] {5,4,3,2,1};
		for(int i=0 ;i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
