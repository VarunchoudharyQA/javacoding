package arays_problems;

public class SecondL_argest_Smallest__In_Array {

	public static void main(String[] args) 
	{
		int temp;
		
		int arr[] = {7,8,0,14,15,16,5};
		int n = arr.length;
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < n; j++) 
			{
				if(arr[i] >arr[j]) 
				
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Largest:"+arr[n-2]);
        System.out.println("Smallest:"+arr[0]);
	}

}
