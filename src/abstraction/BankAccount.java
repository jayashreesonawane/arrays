package abstraction;

public abstract class BankAccount {
	
	    private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public abstract void withdraw(double amount);
	    
	    public abstract void deposit(double amount);

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    protected void setBalance(double balance) {
	        this.balance = balance;
	    }
	}

