package abstraction;

class SavingsAccount extends BankAccount{

	    private double interestRate;

	    public SavingsAccount(String accountNumber, double balance, double interestRate) 
	    {
	        super(accountNumber, balance);
	        this.interestRate = interestRate;
	    }

	    @Override
	    public void withdraw(double amount) 
	    {
	        if (getBalance() >= amount) 
	        {
	            setBalance(getBalance() - amount);
	        }
	        else 
	        {
	            System.out.println("Insufficient funds");
	        }
	    }

	    @Override
	    public void deposit(double amount) 
	    {
	        if (amount > 0) 
	        {
	            setBalance(getBalance() + amount);
	        } 
	        else 
	        {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    public double getInterestRate() 
	    {
	        return interestRate;
	    }
}

	


