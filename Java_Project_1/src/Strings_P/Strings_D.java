package Strings_P;

public class Strings_D {
	
	String a="KarIMulLa";
	        
	String rev="";
	
	public void display()
	{
		
	for(int i=0;i<=a.length()-1;i++)
	{
		char c=a.charAt(i);
	    rev = c+rev;
	}
		
	    System.out.println(rev);
	}

	public static void main(String[] args)
	{
		Strings_D obj = new Strings_D();
		obj.display();
	}
}


