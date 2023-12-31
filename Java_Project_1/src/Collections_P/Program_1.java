package Collections_P;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program_1 {
	
	public void display()
	{
		String[] strArr= {"ABC","DEF","GHI"};
		
		List<String> lt= Arrays.asList(strArr);
		
		Iterator<String> it=lt.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args)
	{
		Program_1 obj = new Program_1();
		obj.display();
	}

}
