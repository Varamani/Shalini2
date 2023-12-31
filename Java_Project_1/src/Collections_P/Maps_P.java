package Collections_P;

import java.util.Map;
import java.util.TreeMap;

public class Maps_P {
	
	public static void main(String[] args)
	{
		TreeMap<Integer,String> hm= new TreeMap<Integer,String>();
		hm.put(106, "Ravana");
		hm.put(102, "Sita");
		hm.put(103, "Krishna");
		hm.put(104, "Raju");
		hm.put(104, "Ramesh");
		hm.put(101, "Ram");
		hm.put(105, "Yashoda");
		hm.put(110, null);
		hm.put(106, "Ranjan");
		hm.put(107, "Arjuna");
		hm.put(108, "Kika");
		hm.put(109, null);
		hm.put(null, null);
		hm.put(null, null);
		
		for(Map.Entry<Integer,String> en : hm.entrySet())
		{
			System.out.println(en.getKey()+"   "+en.getValue());
		}
		
	}

}
