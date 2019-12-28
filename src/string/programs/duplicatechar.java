package string.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatechar {

	
	public void findduplicatechar(String str) 
	{
		Map<Character,Integer> basemap = new HashMap<Character,Integer>();
		
		char[] chrarr = str.toCharArray();
		
		for (char c : chrarr) 
		{
			if(basemap.containsKey(c)) 
			{
				basemap.put(c, basemap.get(c) +1);
			}else 
			{
				basemap.put(c, 1);
			}
		}
		
		Set<Character> keys = basemap.keySet();
		
		for (Character chr : keys) 
		{
			if(basemap.get(chr)>1) 
			{
				System.out.println(chr + "  is " + basemap.get(chr) + " times");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) 
	
	{
		duplicatechar dch = new duplicatechar();
		dch.findduplicatechar("j1ava1");

	}

}
