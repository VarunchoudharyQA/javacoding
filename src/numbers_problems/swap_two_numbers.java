package numbers_problems;

public class swap_two_numbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Number " + x + " Number  " + y);

	}

}
