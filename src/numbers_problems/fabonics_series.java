package numbers_problems;



public class fabonics_series {

	public static void main(String[] args) 
	{
		int n =50;
		int a = 0, b = 0, c = 1;
        
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    } 

}
