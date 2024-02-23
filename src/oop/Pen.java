package oop;

class Ink {
	
	String color;
	int thickness;
	
	Ink()
	{
	}
	Ink(String color, int thickness)
	{
		this.color = color;
		this.thickness = thickness;
	}
	public void displayInk()
	{
		System.out.println("Color : "+color);
		System.out.println("Thickness : "+thickness);
	}
}

public class Pen
{
	String brand;
	String color;
	double price;
	int inkLevel;
	
	Ink ink = new Ink("Blue", 10);

	Pen()
	{
	}
	
	Pen(String brand,String color,double price,int inkLevel)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.inkLevel = inkLevel;
	}
	
	public void displayPen()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("ink Level : "+inkLevel);
	}
}
