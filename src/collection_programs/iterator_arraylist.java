package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	}

}
