package leetCode_easy;
/*
	Given two strings s and t, return true if s is a subsequence of t, 
	or false otherwise.
		A subsequence of a string is a new string that is formed from the original 
		string by deleting some (can be none) of the characters without disturbing 
		the relative positions of the remaining characters. (i.e., "ace" is a 
		subsequence of "abcde" while "aec" is not).
		Example 1:
		Input: s = "abc", t = "ahbgdc"
		Output: true
		Example 2:
		Input: s = "axc", t = "ahbgdc"
		Output: false
 */
public class Q392 {
	public static void main(String[] args) {
		
		String t = "ahbgdc";
		String s = "b" ;
		int n = 0 ;
		boolean flag = false ;
		for (int i = 0; i < t.length() && n < s.length(); i++) 
		{
			if(s.charAt(n) == t.charAt(i))
			{
				flag = true ;
				n++ ;
			}
		}
		System.out.println(n == s.length() && flag ? "true" : "false");
	}
}
