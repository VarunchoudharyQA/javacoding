package string.programs;

public class consecutiveOccurrences {
	
	
	public static void print(String s) 
	{
		for(int i=0; i<s.length()-1;i++) 
		{
			int count =1;
			while(s.charAt(i)== s.charAt(i+1)) 
			{
				i++;
				count++;
				if(i+1 == s.length())
					break;
				
			}
			System.out.println(s.charAt(i) + " " + count + " " );
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		print("aaabbaaddcc");

	}

}
