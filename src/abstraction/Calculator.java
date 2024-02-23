package abstraction;

public abstract class Calculator {
	
	public void welcome(String name)
	{
		System.out.println("Hey "+name+" Welcome to QspCalculator");
	}
	
	public abstract int add(int a, int b);
	
	public abstract double division(double d1, double d2);
}
