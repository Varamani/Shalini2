package Abstraction_P;

public class Non_Abs extends Abs_Class{
	
	public void withDraw() {
		System.out.println("WithDraw");
	}

	public void deposit() {
		System.out.println("deposit");
	}

	public void changePin() {
		System.out.println("changePin");
	}
	
	public static void main(String[] args)
	{
		Abs_Class obj = new Non_Abs();
		obj.withDraw();
		obj.deposit();
		obj.changePin();
		
	}
}
