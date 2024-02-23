package oop;

public class AccountDriver {

	public static void main(String[] args) {
		Account ac=new Account("Axis Bank","Raju",123456789l,6000.00,"Deccan",1234,"Axis1234",9876543210l,"Saving Account");
		
		System.out.println(ac.getName());
		System.out.println(ac.getBalance(123456789,1234));
		
		ac.debit(12345678,1234,-12344.00);
		ac.credit(12345678,9876,2323.23);
		ac.setPin(12345678, 1234, 9876);
	}
	
	
}
