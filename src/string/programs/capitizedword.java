package string.programs;

public class capitizedword {
	
	
	public static String capitilized(String str) 
	{
		String[] strarr = str.split(" ");
		
		String capitilizedword ="";
		
		for(String w : strarr) 
		
		{
			String first = w.substring(0, 1);
			String after = w.substring(1);
			capitilizedword = capitilizedword + first.toUpperCase() + after + " ";
		}
		
		
		return capitilizedword.trim();
		
	}

	public static void main(String[] args)
	{
		System.out.println(capitizedword.capitilized("I love my india"));

	}

}
