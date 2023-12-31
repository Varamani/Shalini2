package BasicJava;

public class Java_Methods {
	
	double a;
	int b;
	int c;
	int d;
	
   public void add(int x,int y)
   {
	a=x;
	b=y;
	System.out.println(a+b);
   }
   
   public void add(double x,int y)
   {
	a=x;
	b=y;
	System.out.println(a+b);
   }
   
   public void add(int x,int y,int z)
   {
	a=x;
	b=y;
	c=z;
	System.out.println(a+b+c);
   }
   
	public static void main(String[] args)
	{	
		Java_Methods obj = new Java_Methods();
		obj.add(10, 20);	
		obj.add(20, 30, 40);
		obj.add(23.7, 80);
	}
	
}
