package string.programs;

public class occurance_of_any_charcater {

	public static void main(String[] args) {
		String str = " Auto-generated method stub";
		
		// o
		
		int result = str.length() - str.replaceAll("u", "").length();
		System.out.println(result);
				

	}

}
