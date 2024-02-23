package Interface;

public class RegisterDriver {
	public static void main(String[] args) {
		
		Register r1 = new Register("Abc",126,876543218);
		System.out.println(r1);
		r1.giveConcession();
	}
}
