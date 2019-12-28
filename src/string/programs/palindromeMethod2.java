package string.programs;
import java.util.Scanner;

public class palindromeMethod2 
{

	
	
	public static void main(String[] args) 
	{
		
		
		String result = "";
		System.out.println("Enter an string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i = str.length()-1;i>=0;i--) 
		{
			result = result + i;
			
		}
		
		if(str.equalsIgnoreCase(result)) 
		{
			System.out.println("Is palindrome");
		}
		else 
		{
			System.out.println("is not an palindrome");
		}
				
	}

}
