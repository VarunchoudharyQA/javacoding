package string.programs;
import java.util.Scanner;

public class ReverseFirstAndLastWord {
	
	
	public String reverseword(String str) 
	{
		String result = new String("");
		
		int len = str.length();
		
		String[] s = str.split(" ");
		
		String temp = s[0];
		
		s[0] = s[s.length-1];
		
		s[s.length-1] = temp;
		
	
		for(int i = 0; i <= s.length-1; i++) 
		{
			result = result + " " + s[i] + " ";
		
		}
		
		return result;
		
		
	}

	public static void main(String[] args) 
	{
		String str = new String("");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		
		ReverseFirstAndLastWord rs = new ReverseFirstAndLastWord();
		
		System.out.println(rs.reverseword(str));
		

	}

}
