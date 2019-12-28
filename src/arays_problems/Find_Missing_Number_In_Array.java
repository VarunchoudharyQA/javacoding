package arays_problems;

public class Find_Missing_Number_In_Array {

	public static void main(String[] args)
	{
			
		int [] inarr = {1,2,3,4,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0; i < inarr.length; i++) 
		{
			sum = sum + inarr[i];
		}

		System.out.println(sum);
		
		
		int sum1 =0;
		for (int j = 1; j <=10; j++) 
		{
			sum1 = sum1 + j;
		} 
		System.out.println(sum1);
		
		System.out.println("Missing number is " +(sum1 - sum));
		
	}

}
