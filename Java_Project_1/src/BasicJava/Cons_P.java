package BasicJava;

public class Cons_P {
	
	
	//Variables
		int a=10;
		int b=20;
		
		
	public Cons_P()
	{
		System.out.println("This is Constructor");
	}
	
	public Cons_P(int x,int y)
	{
		this();
		System.out.println(x);
		System.out.println(y);
	}
	
	public Cons_P(int x,int y,int z)
	{
		this(100,200);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	//Method
	public void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Cons_P obj= new Cons_P(20,30,70);	
	}
}
