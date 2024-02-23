package abstraction;

public class CalcDriver {

	public static void main(String[] args) {
		
		Calculator c1 = new CalcImp();
		System.out.println(c1.add(123, 56));
		//c1.spoil();
		System.out.println(c1.division(5, 2));
		c1.welcome("Jayashree");
	}
}
