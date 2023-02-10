package leetCode_easy;
/*
 1662.  Check If Two String Arrays are Equivalent
		Given two string arrays word1 and word2, return true 
		if the two arrays represent the same string, and false otherwise.
		A string is represented by an array if the array elements concatenated 
		in order forms the string.
		Example 1:
		
		Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
		Output: true
		Explanation:
		word1 represents string "ab" + "c" -> "abc"
		word2 represents string "a" + "bc" -> "abc"
		The strings are the same, so return true.
		Example 2:
		
		Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
		Output: false
		Example 3:
		
		Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
		Output: true
 */
public class Q1662 {
	public static void main(String[] args) 
	{
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		
		String word11 = "";
		String word22 = "";
		
		for (int i = 0; i < word1.length; i++) {
			word11 += word1[i];
		}
		for (int i = 0; i < word2.length; i++) {
			word22 += word2[i];
		}
		System.out.println(word11.equals(word22));
	}
}
