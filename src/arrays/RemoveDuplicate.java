package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,1,5,2,3,3,5,6,3,4,100};
		
		System.out.println(Arrays.toString(ar));
		
		int [] count = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			
			int ct = 1;
			
			for (int j = i+1; j < ar.length; j++) {
				
				if (ar[i]==ar[j]) {
					
					ct++;
					count[j] = -1;
				}
			}
			if (count[i]!=-1) {
				
				count[i] = ct;
			}
		}
		
		int repeatCount = 0;
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i]<0) {
				
				repeatCount++;
			}
		}
		
		int [] unique = new int[ar.length-repeatCount];
		
		for (int i = 0, j = 0; i < ar.length; i++) {
			
			if (count[i]>0) {
				
				unique[j] = ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(unique));
	}
}
