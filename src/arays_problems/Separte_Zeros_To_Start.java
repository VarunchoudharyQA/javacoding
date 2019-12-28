package arays_problems;

import java.util.Arrays;

public class Separte_Zeros_To_Start {

	public static void main(String[] args) 
	{
		int arr[] = {1,0,5,3,0,9,0,2};
		
		System.out.println(Arrays.toString(arr));
		
		int counter = arr.length-1;
		
		for (int i = arr.length-1; i >=0; i--) 
		{
			if(arr[i] != 0) 
			{
				arr[counter] = arr[i];
				counter--;
			}
		}
		
		
		while(counter >=0) 
		{
			arr[counter] = 0;
			counter--;
		}
		
		
			System.out.print(Arrays.toString(arr));

	}

}
