package Abstraction_P;

public abstract class Abs_Class {
	
	public Abs_Class()
	{
		System.out.println("Abstarct class constructor");
	}
	
	public abstract void withDraw();
	
	public abstract void deposit();
	
	public abstract void changePin();

	private static void display()
	{
		System.out.println("Welcome to ICICI");
	}
}
