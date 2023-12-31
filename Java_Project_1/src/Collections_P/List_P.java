package Collections_P;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_P {
	
	public void display()
	{
		List<Integer> lt= new LinkedList<Integer>();
		lt.add(23);
		lt.add(56);
		lt.add(89);
		lt.add(23);
		lt.add(56);
		lt.add(89);
		lt.add(23);
		lt.add(56);
		lt.add(89);
		lt.add(null);
		lt.add(null);
		lt.add(2,67);
		lt.add(4,100);
		
		ListIterator<Integer> it=lt.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	public static void main(String[] args)
	{
		List_P obj = new List_P();
		obj.display();
	}
}
