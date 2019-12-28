package string.programs;

public class splitnumbers_digits_alphabets {

	public static void main(String[] args) 
	{
		String str = "32AA123$#&";
		
		String number = "";
		
		String alphabet ="";
		
		String special = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			char a = str.charAt(i);
			
			
			if(Character.isDigit(a)) 
			{
				number = number + a;
			}
			else if(Character.isLetter(a)) 
			{
				alphabet = alphabet + a;
			}
			else 
			{
				special = special + a;
			}
			
		}
		
		System.out.println("Alphabates in string: "+alphabet);
		System.out.println("Numbers in string: "+number);
		System.out.println("Symbols in string: "+special);
		
		

	}

}
