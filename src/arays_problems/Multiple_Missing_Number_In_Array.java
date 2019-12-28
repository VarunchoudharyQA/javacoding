package arays_problems;

public class Multiple_Missing_Number_In_Array {

	public static void main(String[] args) 
	{
		int arr[] = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		
		
		int check[] = new int [arr.length];
		
		for(int i : arr) 
		{
			check[i] = 1;
		}
		
		
		for (int i = 1; i < check.length; i++) 
		{
			if(check[i] == 0) 
			{
				System.out.println(i);
			}
			
		}

	}

}
