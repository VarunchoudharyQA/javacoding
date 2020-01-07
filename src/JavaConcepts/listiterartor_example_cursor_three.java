package JavaConcepts;

import java.util.LinkedList;
import java.util.ListIterator;

public class listiterartor_example_cursor_three {

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("vroon");
		l.add("Varun");
		l.add("Kumar");
		l.add("choudhary");
		l.add("Arusa");
		
		System.out.println(l);
		
		ListIterator<String> ltr = l.listIterator();
		
		while(ltr.hasNext()) 
		{
			String s = (String) ltr.next();
			
			if(s.equals("vroon")) 
			{
				ltr.remove();
			}
			else if (s.equals("Arusa")) 
			{
				ltr.add("Khan");
			}
			else if (s.equals("Kumar")) 
			{
				ltr.set("is");
			}
		}
		System.out.println(l);
		
		

	}

}
