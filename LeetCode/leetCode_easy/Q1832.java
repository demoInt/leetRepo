package leetCode_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 1832.  Check if the Sentence Is Pangram
		A pangram is a sentence where every letter of the English 
		alphabet appears at least once.
		Given a string sentence containing only lowercase English letters, 
		return true if sentence is a pangram, or false otherwise.
		Example 1:
		Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
		Output: true
		Explanation: sentence contains at least one of every letter of the 
		English alphabet.
		Example 2:
		Input: sentence = "leetcode"
		Output: false
 */
public class Q1832 {
	public static void main(String[] args) {
		
		String s = "onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
        if(set.size() == 26)
        System.out.println(true);
        else
        	System.out.println(false);
	}
}
