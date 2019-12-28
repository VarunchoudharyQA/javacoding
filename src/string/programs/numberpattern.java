package string.programs;

public class numberpattern {

	public static void main(String[] args)
	{
		int lines = 5;
		int value = 1;
		for(int i =1; i<lines;i++) 
		{
			for(int j =1;j<=i;j++) 
			{
				System.out.print(value);
				value++;
			}
			System.out.println();
		}

	}

}
