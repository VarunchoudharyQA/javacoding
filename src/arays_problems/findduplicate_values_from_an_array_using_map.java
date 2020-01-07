package arays_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findduplicate_values_from_an_array_using_map {

	
	
	
	
	public static void main(String[] args) 
	{
		
		int arr[] = {1,2,3,4,4,5,5,6};
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int ele : arr) 
		{
			if(hm.containsKey(ele)) 
			{
				hm.put(ele, hm.get(ele) + 1);
			}
			else 
			{
				hm.put(ele, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entryset = hm.entrySet();
		
		for(Entry<Integer, Integer> en : entryset) 
		{
			if(en.getValue()>1) 
			{
				System.out.println("Duplicate :" +en.getKey() + " found " + en.getValue() + " Times");
			}
		}
		
		

	}

}
