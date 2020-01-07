package numbers_problems;

public class armstromng_number {

	public static void main(String[] args)
	{
		int number = 12;
		
		int check , rem, sum = 0;
		
		check = number;
		
		while(check != 0) 
		{
	         rem = check % 10;
	         sum = sum + (rem * rem * rem);
	         check = check / 10;
	     }
		if(sum == number)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
	}

}
