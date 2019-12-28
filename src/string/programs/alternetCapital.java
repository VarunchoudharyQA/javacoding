package string.programs;

public class alternetCapital {
	
	
	public static void capitilized(String str) 
	{
		
		char[] charrr= str.toCharArray();
		
		for (int i = 0; i < charrr.length; i++) 
		{
			if(i%2==1) 
			{
				charrr[i]=Character.toUpperCase(charrr[i]);
			}
			System.out.print(charrr[i]);
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		alternetCapital.capitilized("varun");

	}

}
//Input : varun
// output: vArUn