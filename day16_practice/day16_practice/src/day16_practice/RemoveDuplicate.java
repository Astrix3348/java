package day16_practice;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,4,5,5};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[i] = 0;
				}
			}
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
