package arrays;

import java.util.Arrays;

public class Rotate {
		
	public static void main(String[] args) {
			
		int[] ar = {1,2,3,4,5,6,7,};
		
		int temp = ar[ar.length-1];
		
		for (int i = ar.length-2; i >= 0; i--) {
			
			ar[i+1] = ar[i];
		}
		
		ar[0] = temp;
		System.out.println(Arrays.toString(ar));
		}
}
