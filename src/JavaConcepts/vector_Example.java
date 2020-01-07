package JavaConcepts;

import java.util.Vector;

public class vector_Example {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		for (int i = 1; i <=10; i++) 
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		
		v.addElement(11);
		
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
