package string.programs;

public class palindrome {

	
	public String reversestr(String str) 
	{
		String result = "";
		
		char[] chrarr = str.toCharArray();
		for (int i = chrarr.length-1; i >=0; i--) 
		{
			result = result + chrarr[i];
		}
		
		return result;
		
		 
	}

		public Boolean checkpalindorme(String str) 
		{
			Boolean result = false;
			
			if(reversestr("nitin").equalsIgnoreCase(str)) 
			{
				return true;
			}else 
			{
				return result;
			}		
					
			 
		}

		public static void main(String[] args) 
		{
			
			palindrome rs = new palindrome();
			System.out.println(rs.checkpalindorme("nitin"));
		}

		

	}
