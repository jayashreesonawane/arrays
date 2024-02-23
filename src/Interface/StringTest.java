package Interface;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "Deccan";
		System.out.println(s.hashCode());
		s = s + "GymKhana";
		System.out.println(s.hashCode());
		s = "Pune";
		System.out.println(s.hashCode());
	}
}
