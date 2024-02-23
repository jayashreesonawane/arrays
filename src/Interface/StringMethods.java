package Interface;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "Aeroplane";
		System.out.println(s.charAt(1));
		System.out.println(s.concat("Air India"));
		System.out.println(s.contains("a"));
		System.out.println(s.endsWith("plane"));
		System.out.println(s.startsWith("Aero"));
		System.out.println(s.equals("Aeroplane"));
		System.out.println(s.equalsIgnoreCase("aEroPlane"));
		System.out.println(s.hashCode());
		System.err.println(s.toString());
		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf("plane"));
		System.out.println(s.indexOf('e',4));
		System.out.println("abcxyzabc".indexOf("abc",5));
		System.out.println("syjgf".isEmpty());
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.length());
		System.out.println(s.replace('e','$'));
		
		String [] ans = "Qsp Deccan".split(" ");
		System.out.println(Arrays.toString(ans));
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		char [] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("   abc   ".trim());
	}
}
