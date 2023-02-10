package leetCode_easy;
/*
Given a string s, check if it can be constructed by taking a substring 
of it and appending multiple copies of the substring together.
Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:
Input: s = "aba"
Output: false
Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class Q459 {
	public static void main(String[] args) {
		
			String str = "abcabcabcabc";
//	   		String s = str + str;
//       	System.out.println(s.substring(1, s.length() - 1).contains(str));
			
			
			// solution 2 
			String s = "" ;
			for (int i = 0; i < str.length()/2; i++) 
			{
				s += str.charAt(i);	
				if(compare(str, s))
				{
					System.out.println(s);
					break;
				}	
			}
	}
	static boolean compare(String str , String s)
	{
		int len = str.length()/s.length();
	//	System.out.println(len);
		String sbs = "";
		for (int i = 0; i < len; i++) 
		{
			sbs += s;
		} 
	//	System.out.println(sbs);
		return sbs.equals(str);
	}
}
