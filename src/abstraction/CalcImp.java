package abstraction;

public class CalcImp extends Calculator{
	
	public int add(int a, int x)
	{
		int res=a+x;
		return res;
	}
	
	public double division(double p, double q)
	{
		return p/q;
	}
	
	public void spoil()
	{
		System.out.println("Worst Company");
	}
}
