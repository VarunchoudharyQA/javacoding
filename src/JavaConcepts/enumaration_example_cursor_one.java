package JavaConcepts;

import java.util.Enumeration;
import java.util.Vector;

public class enumaration_example_cursor_one {

	public static void main(String[] args) {
    Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		for (int i = 1; i <=10; i++) 
		{
			v.addElement(i);
		}
		
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements())
		{
			Integer integer = (Integer) e.nextElement();
			if(integer % 2 == 0) 
			{
				System.out.println(integer);
			}
			
		}

	}

}
