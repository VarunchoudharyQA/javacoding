package string.programs;

import java.util.HashMap;
import java.util.Map;

public class number_of_words_in_string {

	public static void main(String[] args) 
	{
		
		
		String s = "I am Traveling to pune today";
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		String str[] = s.split(" ");
		
		for(int i =0; i<=str.length-1;i++) 
		{
			System.out.println(str[i]);
			
			if(hm.containsKey(str[i])) 
			{
				hm.put(str[i], hm.get(str[i]) +1);
			}
			else 
			{
				hm.put(str[i], 1);
			}
		}
		
		for(String st : hm.keySet()) 
		{
			System.out.println("The count of word " + st + " is " + hm.get(st));
		}
	}

}
