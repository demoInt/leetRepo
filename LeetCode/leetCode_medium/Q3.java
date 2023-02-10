package leetCode_medium;
/*
 Given a string s, find the length of the longest 
substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Q3 {
	public static void main(String[] args) { 	

		String s = "pwwkewo";
		char c ;
		int max = Integer.MIN_VALUE;
		String safe = "";


		for (int j = 0; j < s.length(); j++) {

			String longestString = "";
			longestString += s.charAt(j);

			for (int i = j+1; i < s.length() ; i++) 
			{
				c = s.charAt(i);
				if(longestString.indexOf(c) == -1)
				{
					longestString += c;
				}
				else
				{
					break;
				}
			}
			if(max < longestString.length())
			{
				max = longestString.length();
				safe = longestString;
			}
		}
		System.out.println(safe+"  "+max);
	}
}