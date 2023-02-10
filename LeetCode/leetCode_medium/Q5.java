package leetCode_medium;
/*
 Given a string s, return the longest palindromic substring.
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
 */ 
public class Q5 {
	public static void main(String[] args) 
	{
	/*
		String s = "babad";
		String longestString = "";
		String tempString = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			tempString = "";
			tempString += s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) 
			{
				tempString += s.charAt(j);
				if(tempString.length() > longestString.length() && isPalindrome(tempString))
				{
					longestString = tempString;
				}
			}
		}
		System.out.println(longestString);
	}
	
	public static boolean isPalindrome(String s)
	{
		String revString = "";
		int i = s.length()-1;
		while(i >= 0)
		{
			revString += s.charAt(i);
			i--;
		}
		return s.equals(revString) ;
	}
 */
		/*
// 		  String s = "babad";
 		  String s = "aebcdcbea";
		  int n = s.length();
		  String res = null;
		    
		  boolean[][] dp = new boolean[n][n];
		    
		  for (int i = n - 1; i >= 0; i--)  
		  {
		    for (int j = i; j < n; j++) 
		    {
		      dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
		            
		      if(dp[i][j] && (res == null || j - i + 1 > res.length())) 
		      {
		        res = s.substring(i, j + 1);
		      }
		    }
		  }		    
		  System.out.println(res);
		*/
		
		 String s = "babad" ;
		 int end = 0, start = 0 ;
		 
		 for (int i = 0; i < s.length(); i++) 
		 {
			 int len1 = toExpandAndCheck(s, i, i) ;
			 int len2 = toExpandAndCheck(s, i, i+1);
			 int len  = len1 > len2 ? len1:len2 ; 
			 if(len > end-start)
			 {
				 start = i - ((len-1)/2) ;
				 end = i + (len/2) ;
			 }
		}
		 System.out.println(s.substring(start, end+1));
	}	
	private static int toExpandAndCheck(String s , int left , int right)
	{
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
		{
			left-- ;
			right++ ;
		}
		return right - left - 1 ;
	}
}
