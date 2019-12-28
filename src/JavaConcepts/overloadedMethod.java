package JavaConcepts;

public class overloadedMethod {


		// Overloaded methods 
	    	    public void fun(String name) 
	    { 
	        System.out.println("fun(String ) "); 
	    } 
	  
	    // Driver code 
	    public static void main(String [] args) 
	    { 
	    	overloadedMethod mv = new overloadedMethod(); 
	          
	       
	        mv.fun(null); 
	    } 

}
