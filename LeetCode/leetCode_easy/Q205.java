package leetCode_easy;

import java.util.HashMap;
import java.util.Map;

/*
 205. Isomorphic Strings
	Given two strings s and t, determine if they are isomorphic.
	Two strings s and t are isomorphic if the characters in s can be replaced to get t.
	All occurrences of a character must be replaced with another character while 
	preserving the order of characters. No two characters may map to the same character,
	 but a character may map to itself.
	Example 1:
	Input: s = "egg", t = "add"
	Output: true
	Example 2:
	Input: s = "foo", t = "bar"
	Output: false
	Example 3:
	Input: s = "paper", t = "title"
	Output: true
 */
public class Q205 {
	public static void main(String[] args) {
		
		String s = "egg" ;
		String t = "add" ;

//		   if(s.length() != t.length()){
//	            return false ;
//	        }
//
//	        HashMap<Character , Character> hm = new HashMap<>();
//	        
//	        for(int i = 0 ; i <s.length() ; i++)
//	        {
//	            if(hm.containsValue(t.charAt(i)))
//	            {
//	                continue ;
//	            }
//	            else
//	            {
//	                hm.put(s.charAt(i),t.charAt(i));
//	            }
//	        }
//	        StringBuilder sb = new StringBuilder();
//	        for(int i = 0 ; i <s.length() ;i++){
//	            sb.append(hm.get(s.charAt(i)));
//	        }
//	      
//	        return(sb.toString().equals(t));
	}
}
