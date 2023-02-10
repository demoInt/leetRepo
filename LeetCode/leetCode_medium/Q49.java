package leetCode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
49. Group Anagrams
	Given an array of strings strs, group the anagrams together. You can return the answer in any order.
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
	Example 1:
	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	Example 2:
	Input: strs = [""]
	Output: [[""]]
	Example 3:
	Input: strs = ["a"]
	Output: [["a"]]
 */
public class Q49 {
	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"} ;
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String ele : strs)
		{
			char[] arr = ele.toCharArray();
			Arrays.sort(arr);
			
			String s = new String(arr);
			
			if(!(map.containsKey(s)))
			{
				map.put(s, new ArrayList<>()) ;
			}				
			map.get(s).add(ele) ;		
		}
		List<List<String>> list = new ArrayList<>();
		list.addAll(map.values()) ;
		System.out.println(list);	
	}
}
