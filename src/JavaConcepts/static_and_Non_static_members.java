package JavaConcepts;

public class static_and_Non_static_members 
{
	int a = 18;
	static int b = 80;
	
	static void test() 
	{
		int i = 10;
		System.out.println("Program test is runing ");
		System.out.println("Local variable of i "+i);
	}
	
	void test1() 
	{
		int j = 20;
		System.out.println("Test2 is runing ");
		System.out.println("LV value of j"+j);
	}
	

	public static void main(String[] args)
	{
		System.out.println("Program started from here");
		
		static_and_Non_static_members sb = new static_and_Non_static_members();
		sb.test1();

	}

}
