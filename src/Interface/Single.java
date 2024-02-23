package Interface;

// Singleton Class

public class Single {
	
	static int no;
	String name;
	int age;
	private Single(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public static Single createObject(String name, int age)
	{
		if(no<1)
		{
			no++;
			return new Single(name,age);
		}
		return null;
	}
}
