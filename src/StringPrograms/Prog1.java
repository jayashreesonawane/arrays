package StringPrograms;
import java.util.Scanner;
public class Prog1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String ip = sc.nextLine();
		for (int i = 0; i < ip.length(); i++) {
			System.out.println(ip.charAt(i));
		}
	}
}
