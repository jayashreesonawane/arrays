package Interface;

public class SingleDriver {
	public static void main(String[] args) {
		
		Single s1 = Single.createObject("Shree",23);
		System.out.println(s1);
		Single s2 = Single.createObject("jay", 12);
		System.out.println(s2);
	}
}
