package JavaConcepts;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);
		System.out.println(s.search(10));

	}

}
