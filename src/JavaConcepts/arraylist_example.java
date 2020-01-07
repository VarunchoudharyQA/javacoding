package JavaConcepts;

import java.util.ArrayList;

public class arraylist_example 
{

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("a");
		l.add("b");
		l.add(null);
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		
		l.add("a");
		l.add("a");
		
		
		System.out.println(l);
		
		l.remove(2);
		
		System.out.println(l);
		
		l.get(1);
		
		l.size();
		l.indexOf("a");
		l.lastIndexOf("a");
		
		System.out.println(l);

	}

}
