package arays_problems;

public class findduplicate_values_from_an_array {

	public static void main(String[] args) 
	{
		int arr[] = {2,2,3,4,5,6,6,8,9,9};
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] == arr[j] & (i!=j)) 
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
