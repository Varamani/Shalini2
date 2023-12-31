package Strings_P;

public class Program_5 {
	
	String a= "I am an Indian";
	
	public void display()
	{
		String[] a1=a.split(" ",2);
		
		System.out.println("Array Lenghth is : "+a1.length);
		
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
	}

	public static void main(String[] args)
	{
		Program_5 obj = new Program_5();
		obj.display();
	}
}
