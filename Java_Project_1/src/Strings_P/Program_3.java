package Strings_P;

public class Program_3 {
	
	String a="Karimulla";
	String a1="Karimulla";
	String a2="Karimulla";
	String a3="karimulla";
	String a4="Shaik";

	public void display()
	{
	    a=a.concat(a4);
	    System.out.println(a);
	    
	    System.out.println(a1);
	    System.out.println(a2);
	}
	
	public static void main(String[] args)
	{
		Program_3 obj = new Program_3();
		obj.display();
	}
}
