package leetCode_easy;

import java.util.HashSet;

/*
   409. Longest Palindrome
		Given a string s which consists of lowercase or uppercase letters, 
		return the length of the longest palindrome that can be built with those letters.
		Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
		Example 1:
		Input: s = "abccccdd"
		Output: 7
		Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
		Example 2:
		Input: s = "a"
		Output: 1
		Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
public class Q409 {
	public static void main(String[] args) {

		String s  = "abccccdd";
		HashSet<Character>h=new HashSet<>();
		int len=0;
		for(char e:s.toCharArray())
		{
			if(h.contains(e))
			{
				len+=2;
				h.remove(e);
			}
			else
			{
				h.add(e);
			}
		}

		if(h.size()>0)
			System.out.println(len+1);
		else
			System.out.println(len);
	}
}
