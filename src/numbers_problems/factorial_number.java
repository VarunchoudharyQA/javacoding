package numbers_problems;



public class factorial_number {

	public static void main(String[] args) 
	{
		int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial * i;
            
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
	}
		
	}
