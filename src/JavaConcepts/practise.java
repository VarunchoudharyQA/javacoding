package JavaConcepts;

public class practise 


{
	public static void main(String[] args) {
	
	String s1 = "hello";
	String s2 = "hello";
	String s3 = s1;
	
	
	String s4 = new String("HELLO");
	String s5 = new String("hello");
	
	System.out.println(s1 == s2);
	System.out.println(s1 == s3);
	
	System.out.println(s1 == s4);
	
	System.out.println(s4 == s5);
	
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s4.equals(s5));
	
	System.out.println(s1.equals(s4));
	
	}
	
}
