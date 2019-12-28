package string.programs;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate 
{
	
	public static String rmdup(String str) 
	{
		Set<Character> st = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) 
		{
			Character c = str.charAt(i);
			
			if(!st.contains(c)) 
			{
				st.add(c);
				sf.append(c);
			}
			
		}
		
		
		
		return sf.toString();
		
	}

	public static void main(String[] args) 
	{
		System.out.println(removeDuplicate.rmdup("aaaasadfsfasf"));

	}

}
