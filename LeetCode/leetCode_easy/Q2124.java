package leetCode_easy;

import java.util.Arrays;

/*
 2124. Check if All A's Appears Before All B's
	Given a string s consisting of only the characters 'a' and 'b', 
	return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
	Example 1:
	Input: s = "aaabbb"
	Output: true
	Explanation:
	The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
	Hence, every 'a' appears before every 'b' and we return true.
	Example 2:
	Input: s = "abab"
	Output: false
	Explanation:
	There is an 'a' at index 2 and a 'b' at index 1.
	Hence, not every 'a' appears before every 'b' and we return false.
	Example 3:
	Input: s = "bbb"
	Output: true
	Explanation:
	There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
 */
public class Q2124 {
	public static void main(String[] args) {
		
		String s = "aababbb" ;
		char[] s2 = s.toCharArray() ;
		Arrays.sort(s2) ;
		int i = 0 ;
		for(char ch : s2)
		{
			if(s.charAt(i) != ch)
				System.out.println(false);
			i++ ;
		}
		
	}
}
