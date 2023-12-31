package Looping_Statements;

public class For_Loop {
	
	public void display()
	{
		/*
		 * 	1  100
			2  99
			3  98
			4  97
			5  96
			.
			.
			100 1
		 * 
		 */
		
		for(int i=1;i<=100;i=i++)
		{
			for(int j=100;j>=1;j--)
			{
				System.out.println(i+" "+j);
			}
		}
		
	}

	public static void main(String[] args)
	{
		For_Loop obj = new For_Loop();
		obj.display();
	}
}
