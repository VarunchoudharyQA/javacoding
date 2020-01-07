package collection_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class iterator_hasmap {

	public static void main(String[] args) 
	{
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		hm.put('c', 1);
		hm.put('h', 1);
		hm.put('o', 1);
		hm.put('u', 1);
		hm.put('d', 1);
		hm.put('h', 1);
		hm.put('a', 1);
		hm.put('r', 1);
		
		System.out.println(hm);
		
		Iterator<Entry<Character, Integer>> itr = hm.entrySet().iterator();
		
		
		
		while(itr.hasNext()) 
		{
			Map.Entry<Character, Integer> en = (Map.Entry<Character, Integer>) itr.next();
			System.out.println(en);
		}
		
		
	}

}
