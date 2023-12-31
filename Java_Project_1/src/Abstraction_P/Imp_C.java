package Abstraction_P;

public class Imp_C implements Interface_1,Interface_2{

	public void withdraw() {
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
		Imp_C obj = new Imp_C();
		obj.changePin();
		obj.withdraw();
		obj.deposit();
		
		Interface_1.display();
		Interface_2.display();
	}
}
