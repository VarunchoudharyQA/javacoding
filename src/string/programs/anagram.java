package string.programs;

import java.util.Arrays;

public class anagram {
	
	
	public static boolean checkanagram(String str1 , String str2) 
	{
		char[] chrarr1 = str1.toCharArray();
		char[] chrarr2 = str2.toCharArray();
		
		Arrays.sort(chrarr1);
		Arrays.sort(chrarr2);
		
		if(Arrays.toString(chrarr1).equalsIgnoreCase(Arrays.toString(chrarr2)))
			return true;
					return false;
	}

	public static void main(String[] args) 
	{
		if(checkanagram("stop", "top") == true) 
		{
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not an anagram");
		}
		
	}

}
