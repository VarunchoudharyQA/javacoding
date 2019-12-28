package string.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintFirstNonRepatedchar 
{

	public static Character printFirstRepated(String str) 
	{
		Map<Character,Integer> baseMap = new LinkedHashMap<>();
		
		for(int i = 0; i< str.length();i++) 
		{
			Character ch = str.charAt(i);
			if(baseMap.containsKey(ch)) 
			{
				baseMap.put(ch, baseMap.get(ch) + 1);
			}
			else 
			{
				baseMap.put(ch, 1);
			}
		}
		
		
		
		for(Entry<Character,Integer> entry : baseMap.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		return null;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputText = sc.next();
		
		Character c = printFirstRepated("abbccddeffgg");
		if(c!= null) 
		{
			System.out.println("First Non Repeated character is " +c);
		}
		else 
		{
			System.out.println("No single character is repeated ");
		}

	}

}
