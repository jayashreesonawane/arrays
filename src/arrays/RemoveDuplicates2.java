package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		
		int size = sc.nextInt();
		
		int [] ar = new int[size];
		
		System.out.println("Enter elements to array : ");
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Elements stored successfully ! ");
		
		System.out.println(Arrays.toString(ar));
		
		System.out.println("Unique elements are : ");
		
		System.out.println(Arrays.toString(makeUniqueArray(ar)));
	}
	
	public static int [] frequency(int [] ar) {
		
		int count [] = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			
			int ct = 0;
			
			for (int j = i+1; j < ar.length; j++) {
				
				if (ar[i]==ar[j]) {
					
					ct++;
					count[j] = -1;
				}
			}
			
			if (count[i] != -1) {
				
				count[i] = ct;
			}
		}
		return count;
	}
	
	public static int repeatedCount(int[] a) {
		
		int repeatCount = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<0) {
				
				repeatCount++;
			}
		}
		return repeatCount;
	}
	
	public static int[] makeUniqueArray(int[] ar) {
		
		int count[] = frequency(ar);
		
		int repeat = repeatedCount(count);
		
		int unique[] = new int[ar.length-repeat];
		
		for (int i = 0, j = 0; i < ar.length; i++) {
			
			if (count[i]>=0) {
				
				unique[j] = ar[i];
				j++;
			}
		}
		return unique;
	}
}
