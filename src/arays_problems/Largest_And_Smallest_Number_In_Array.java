package arays_problems;

public class Largest_And_Smallest_Number_In_Array {

	public static void main(String[] args) 
	{
		int arr[] = {7,8,0,14,15,16,5};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i] > largest) 
			{
				largest = arr[i];
				
			}
			else if(arr[i] < smallest) 
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest number is "+largest);
		System.out.println("Smallest number is "+smallest);

	}

}
