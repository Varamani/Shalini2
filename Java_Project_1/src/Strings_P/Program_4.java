package Strings_P;

public class Program_4 {
	
	// == and equal() and =
	
	int a=30;
	int b=40;
	
	String s="India";
	String s1="India";
	
	boolean b1=true;
	boolean b2=true;
	
	public void display()
	{
	if(a==b)
	{
		System.out.println("a and b are same");
	}else
	{
		System.out.println("a and b are not same");
	}
	
	if(b1==b2)
	{
		System.out.println("b1 and b2 are same");
	}else
	{
		System.out.println("b1 and b2 are not same");
	}
	
	if(s==s1)
	{
		System.out.println("s and s1 are same");
	}else
	{
		System.out.println("s and s1 are not same");
	}
	
	if(s.equals(s1))
	{
		System.out.println("s and s1 are same");
	}else
	{
		System.out.println("s and s1 are not same");
	}
	
	}
	
	public static void main(String[] args)
	{
		Program_4 obj = new Program_4();
		obj.display();
	}
	

}
