package leetCode_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 242. Valid Anagram
	Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	An Anagram is a word or phrase formed by rearranging the letters of a different word 
	or phrase, typically using all the original letters exactly once.
	Example 1:
	Input: s = "anagram", t = "nagaram"
	Output: true
	Example 2:
	Input: s = "rat", t = "car"
	Output: false
 */
public class Q242 {
	public static void main(String[] args) {
		
		String s = "anagram";
		String  t = "nagaram";
		
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		String s2 = new String(s1);
		String t2 = new String(t1);
		
		System.out.println(s2.equals(t2) ? "anagram":"not an anagram" );
	}
}
