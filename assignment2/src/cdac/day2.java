package cdac;
import java.util.Scanner;

public class day2 {
	
	public static int maximum(int[] arr) {
		
        int max=arr[0];
		
		for(int i=0; i<5; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}	
		return max;
	}
	
	public static int minimum(int[] arr) {
		int min = arr[0];
		
		for(int i=0; i<5; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void duplicate(int[] arr) {
		
	
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]==arr[j]) {
				  System.out.println(arr[i]);
				}     
			}	
		}
	}
	
	public static void ascending(int[] arr) {
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
		Scanner myObj = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = myObj.nextInt();
		}
		int result = maximum(arr);
		System.out.println(result);
		
		int res2 = minimum(arr);
		System.out.println(res2);
		
		duplicate(arr);
		
		ascending(arr);
		
	}

}
