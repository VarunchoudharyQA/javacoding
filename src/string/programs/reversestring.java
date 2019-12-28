package string.programs;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class reversestring {


	public static void main(String[] args) 
	{
		
       String str = "India is my country and i love my country";
		
		String strarr[] = str.split(" ");
		for(int i = 0; i<= strarr.length-1; i++) 
		{
			char[] chrarr = strarr[i].toCharArray();
			for (int j = chrarr.length-1; j >=0; j--) 
			{
				
				System.out.print(chrarr[j]);
			}
			
			System.out.print(" ");
			
		}
	}

}
