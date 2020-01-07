package collection_programs;

import java.util.ArrayList;

public class convert_arraylist_to_array {

	public static void main(String[] args) 
	{
		
       ArrayList<String> al = new ArrayList<String>();
		
		
		al.add("Varun");
		al.add("Apple");
		al.add("Mango");
		al.add("zero");
		
		
		String name[] = al.toArray(new String[al.size()]);
		
		for(String k : name) 
		{
			System.out.println(k);
		}
		

	}

}
