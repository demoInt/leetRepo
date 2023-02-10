package leetCode_medium;

import java.util.ArrayList;
import java.util.List;

/*
 438. Find All Anagrams in a String
		Given two strings s and p, return an array of 
		all the start indices of p's anagrams in s. You may return 
		the answer in any order.
		
		An Anagram is a word or phrase formed by rearranging the letters of 
		a different word or phrase, typically using all the original letters 
		exactly once.
		Example 1:
		Input: s = "cbaebabacd", p = "abc"
		Output: [0,6]
		Explanation:
		The substring with start index = 0 is "cba", which is an anagram of "abc".
		The substring with start index = 6 is "bac", which is an anagram of "abc".
		Example 2:
		Input: s = "abab", p = "ab"
		Output: [0,1,2]
		Explanation:
		The substring with start index = 0 is "ab", which is an anagram of "ab".
		The substring with start index = 1 is "ba", which is an anagram of "ab".
		The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class Q438 {
	public static void main(String[] args) {
		
		String  s = "cbaebabacd", p = "abc" ;
		
		List<Integer> result = new ArrayList<>();
		
		int[] charCount = new int[26];
		
		for(char ch : p.toCharArray())
			charCount[ch-'a']++ ;
		
		int left = 0 , right = 0 , count = p.length();
		
		while(right < s.length())
		{
			if(charCount[s.charAt(right++)-'a']-- >= 1)
				count--;
			
			if(count == 0)
				result.add(left);
			
			if(right-left == p.length() && charCount[s.charAt(left++)-'a']++ >= 0)
				count++ ;
		}
		
		System.out.println(result);
	}
}
