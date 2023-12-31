package BasicJava;

public class Static_Keyword {
	
	int a=10;
	int b=20;
	int c;
	static int x=100;
	static int y=200;
	static int z;

	//non-static method
	public void add()
	{
		z=a+b;
		System.out.println(z);
		Static_Keyword.sub();
	
	}
	
	//static method
	public static void sub()
	{
		z=y-x;
		System.out.println(z);
	}
	
	public static void main(String[] args)
	{
		Static_Keyword obj = new Static_Keyword();
		obj.add();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);

		System.out.println(Static_Keyword.x);
		System.out.println(Static_Keyword.y);
		System.out.println(Static_Keyword.z);
		Static_Keyword.sub();
	}
}
