package JavaConcepts;

public class static_and_non_static_block 
{
	static int i;
	int j;

	
	// Staic initilaize block
	
	static void display() 
	{
		System.out.println("Satic method display is runing ");
	}
	
	void print() 
	{
		System.out.println("Non Static method print is runing");
	}
	
	public static void main(String[] args) 
	{
		
		static_and_non_static_block.display();
		System.out.println("tatic GV i =" +static_and_non_static_block.i);
		static_and_non_static_block SNSB1 = new static_and_non_static_block();
		SNSB1.print();
		System.out.println("Non static GV J =" +SNSB1.j);
	}
	
	static 
	{
		System.out.println("Static block is runing ");
		i = 29;
		display();
		static_and_non_static_block SNSB = new static_and_non_static_block();
		SNSB.print();
		System.out.println("Static block Ends here ");
	}

	{
		System.out.println("Non static block is runing");
		j=29;
		print();
		display();
		System.out.println("Non static block Ends Here");
	}
}
