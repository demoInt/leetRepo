package leetCode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 567. Permutation in String
	Given two strings s1 and s2, return true if 
	s2 contains a permutation of s1, or false otherwise.
	In other words, return true if one of s1's 
	permutations is the substring of s2.
	Example 1:
	Input: s1 = "ab", s2 = "eidbaooo"
	Output: true
	Explanation: s2 contains one permutation of s1 ("ba").
	Example 2:
	Input: s1 = "ab", s2 = "eidboaoo"
	Output: false
 */
public class Q567 {
	public static void main(String[] args) {
		
		String s1 = "ab", s2 = "eidaooo" ; 
		
		 int[] charCount  = new int[26];
	        
	        for(char ch : s1.toCharArray())
	        {
	            charCount[ch-'a']++ ;
	        }

	        int left = 0, right = 0, count = s1.length();

	        while(right < s2.length())
	        {
	            if(charCount[s2.charAt(right++)-'a']-- >= 1)
	                count--;
	            
	            if(count == 0)
	            {
	            	System.out.println(true);
	            	break ;
	            }
	         
	            if(right-left == s1.length() && charCount[s2.charAt(left++)-'a']++ >= 0)  
	                count++ ;  
	        }
	}
}
