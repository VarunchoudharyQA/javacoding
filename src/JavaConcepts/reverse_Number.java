package JavaConcepts;


public class reverse_Number {
	
	static 
	{
		System.out.println("Static block is running ");
	}

	public static void main(String[] args) {
		
		reverse_Number rn = new reverse_Number();
		int i = 10;
		
		
		
		int j = (i++) + (++i) + (i) + (i++)+ (++i);
		
		System.out.println(j);
		
	}
	
	{
		System.out.println("Non Static block is runing ");
	}

}
