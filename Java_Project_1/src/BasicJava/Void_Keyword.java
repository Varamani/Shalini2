package BasicJava;

public class Void_Keyword {

	int a=10;
	int b=20;
	
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public int sub()
	{
		int c=b-a;
		return c;
	}
	
	
	public static void main(String[] args)
	{
		Void_Keyword obj = new Void_Keyword();
		obj.add();
		int d=obj.sub();
		System.out.println(d);
	}
}
