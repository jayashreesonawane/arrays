package Interface;

public class Register {
	
	String name;
	int age;
	long phno;
	public Register()
	{
	}
	public Register(String name, int age, long phno)
	{
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	public void giveConcession()
	{
		if (age>60 && age<125) 
		{
			System.out.println("Eligible for concession");
		}
		else if(age>125)
		{
			throw new AgeLimitException("This age can not be considered");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	
	public String toString()
	{
		return "Name= "+name+", age= "+age+", Phone= "+phno;
	}
	
}
