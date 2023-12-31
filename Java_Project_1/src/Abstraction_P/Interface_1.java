package Abstraction_P;

public interface Interface_1 {

	public void withdraw();
	
	public void deposit();
	
	public void changePin();
	
	public static void display()
	{
		System.out.println("Welcome ICICI");
	}
	
	private void enterCard()
	{
		System.out.println("Enter your card");
	}
}
