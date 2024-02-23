package abstraction;

public class BankAccountDriver {

	    public static void main(String[] args) 
	    {    
	        SavingsAccount sa = new SavingsAccount("SA123456", 1000.0, 0.05);

	        System.out.println("Account Number: " + sa.getAccountNumber());
	        System.out.println("Initial Balance: $" + sa.getBalance());
	        System.out.println("Interest Rate: " + sa.getInterestRate() * 100 + "%");

	        sa.deposit(500.0);
	        sa.withdraw(200.0);

	        System.out.println("Updated Balance: $" + sa.getBalance());

	        sa.deposit(-100.0);

	        System.out.println("Final Balance: $" + sa.getBalance());
	    }
}






