package JavaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_example_cursor_two {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i <= 10; i++) 
		{
			l.add(i);
		}
		System.out.println(l);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) 
		{
			Integer I = (Integer) it.next();
			
			if(I % 2 == 0) 
			{
				System.out.println(I);
			}
			else
			{
				it.remove();
			}
		}
		System.out.println(l);

	}

}
