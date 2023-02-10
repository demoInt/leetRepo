package leetCode_easy;

import java.util.Stack;

/*
 345. Reverse Vowels of a String
	Given a string s, reverse only all the vowels 
	in the string and return it.
	The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
	appear in both lower and upper cases, more than once.
	Example 1:
	Input: s = "hello"
	Output: "holle"
	Example 2:
	Input: s = "leetcode"
	Output: "leotcede"
 */
public class Q345 {
	public static void main(String[] args) {
		
		String s  = "hello" ;
		
		String vowel = "aeiouAEIOU" ;
		String str = "";
		Stack<Character> stack = new Stack<>() ;
		
		for (int i = 0; i < s.length(); i++) {
			if(vowel.indexOf(s.charAt(i)) != -1)
				stack.push(s.charAt(i)) ;
		}
	
		for (int i = 0; i < s.length(); i++) {
			
			if(vowel.indexOf(s.charAt(i)) != -1)
				str += stack.pop();
			else
				str += s.charAt(i);
		}	
	}
}
