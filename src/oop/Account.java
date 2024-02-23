package oop;
public class Account{
	
	private String bankName;
	private String name;
	private long accno;
	private double balance;
	private String branch;
	private int pin;
	private String ifsc;
	private long mob;
	private String type;
	
	Account()
	{
	}
	
	Account(String bank, String name, long accno, double balance, String branch, int pin, String ifsc, long mob, String type)
	{
		bankName = bank;
		this.name=name;
		this.accno=accno;
		this.balance=balance;
		this.branch=branch;
		this.pin=pin;
		this.ifsc=ifsc;
		this.mob=mob;
		this.type=type;
		
		System.out.println("Account Created!!");
	}
	
	public long getAccount()
	{
		return accno;
	}
	public String getType()
	{
		return type;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public String getBranch()
	{
		return branch;
	}
	public long getMob()
	{
		return mob;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance(long accno,int pin)
	{
		if (accno==this.accno && pin==this.pin) {
			
			return balance;
		}
		return 0.0;
	}
	public void debit(long accno,int pin,double amt)
	{
		if (accno==this.accno && pin==this.pin) {
			
			System.out.println("Login Success!");
			if (amt>0 && (balance-amt)>=2000) {
				
				balance=amt;
				System.out.println(amt+" was deducted");
				System.out.println("Balance is: "+balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		else {
			
			System.out.println("Insufficient Balance");
		}
	}
	public void credit(long accno, int pin, double amt)
	{
		if (accno==this.accno && pin==this.pin) {
			
			System.out.println("Login Success");
			balance = balance+amt;
			System.out.println(amt+" was credited");
			System.out.println("Balance is: "+balance);
		}
		else {
			System.out.println("Invalid Login Credentials");
		}
	}
	public void setPin(long accno,int oldPin,int newPin)
	{
		if (accno==this.accno && oldPin==pin) {
			
			pin=newPin;
			System.out.println("Pin Updated!");
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
}

