package leetCode_easy;

import java.util.HashMap;
import java.util.Map;

/*
 290. Word Pattern
	Given a pattern and a string s, find if s follows the same pattern.
	Here follow means a full match, such that there is a 
	bijection between a letter in pattern and a non-empty word in s.
	Example 1:
	Input: pattern = "abba", s = "dog cat cat dog"
	Output: true
	Example 2:
	Input: pattern = "abba", s = "dog cat cat fish"
	Output: false
	Example 3:
	Input: pattern = "aaaa", s = "dog cat cat dog"
	Output: false
 */
public class Q290 { 
	public static void main(String[] args) {
		
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		String[] words  = s.trim().split(" ");
		
//		if(words.length != pattern.length())
//      {
//          return false ;
//      }
		
		Map<Character, String> map = new HashMap<>() ;
		
		for (int i = 0; i < words.length; i++) {
			
			if(map.containsKey(pattern.charAt(i)))
			{
				if(!map.get(pattern.charAt(i)).equals(words[i]))
				{
					System.out.println(false);
				}
			}
			else
			map.put(pattern.charAt(i), words[i]) ;			
		}
		System.out.println(true);
	}
}
