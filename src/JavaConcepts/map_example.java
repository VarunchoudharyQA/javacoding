package JavaConcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map_example {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Varun", 100);
		hm.put("choudhary", 200);
		hm.put("Aru", 300);
		hm.put("khan", 400);
		
		System.out.println(hm);
		System.out.println(hm.put("Varun", 1000));
		
		Set<String> s = hm.keySet();
		
		System.out.println(s);
		
		Collection<Integer> c = hm.values();
		
		System.out.println(c);
		
		Set s1 = hm.entrySet();
		
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) 
		{
			Map.Entry<String, Integer> m1 = (Entry<String, Integer>) itr.next();
			
			System.out.println(m1.getKey() + "......" + m1.getValue());
			
			if(m1.getKey().equals("Varun")) 
			{
				m1.setValue(10000);
			}
		}
		System.out.println(hm);
		

	}

}
