package leetCode_easy;

import java.util.HashMap;

/*
Given a string s, find the first non-repeating character 
in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */
public class Q387 {
	public static void main(String[] args) {

		String s = "aabzbcc" ;
		for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
			{
				System.out.println(i);
				break;
			}
		}
	}

}
