package Collections_P;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set_P {
	
	public void display()
	{
		Set<Integer> st= new HashSet<Integer>();
		st.add(10);
		st.add(8);
		st.add(15);
		st.add(2);
		st.add(15);
		st.add(10);
		st.add(1);
		st.add(3);
		st.add(8);
		st.add(null);
		st.add(null);
		
		List<Integer> lt = new ArrayList<Integer>();
		lt.addAll(st);
	
		Iterator<Integer> it=lt.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	public static void main(String[] args)
	{
		Set_P obj = new Set_P();
		obj.display();
	}

}
