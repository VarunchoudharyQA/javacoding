package arays_problems;

public class Lartgest_two_numbers_In_Arrays {

	public static void main(String[] args) 
	{
		int largest1, largest2, temp;
		int arr[] = {-1,-2,-4,-6,-7,-9,-5};
		largest1 = arr[0];
		largest2 = arr[1];
		
		
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
		
		
		for (int i = 2; i < arr.length; i++)
		{
			if (arr[i] > largest1)
			{
				largest2 = largest1;
				largest1 = arr[i];
			}
			else if (arr[i] > largest2 && arr[i] != largest1)
			{
				largest2 = arr[i];
			}
		}
 
		System.out.println ("The First largest is " + largest1);
		System.out.println ("The Second largest is " + largest2);
 

	}

}
