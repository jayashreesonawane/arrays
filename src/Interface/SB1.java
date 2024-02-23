package Interface;

public class SB1 {
	public static void main(String[] args) {
		
		StringBuilder ab = new StringBuilder("Deccan");
		System.out.println(ab.hashCode());
		ab = ab.append("pune");
		System.out.println(ab.hashCode());
	}
}
