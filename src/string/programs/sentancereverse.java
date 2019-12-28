package string.programs;

public class sentancereverse {

	public static void main(String[] args) 
	{
		String str = "I love my country";
		 
		String[] strarr = str.split(" ");
		
		for (int i = strarr.length-1; i>=0; i--) 
		{
			System.out.print(strarr[i] + " ");
		}
		

	}

}
