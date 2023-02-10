package leetCode_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 771. Jewels and Stones
	You're given strings jewels representing the types of stones that are jewels, and stones 
	representing the stones you have. Each character in stones is a type of stone you have. 
	You want to know how many of the stones you have are also jewels.
	Letters are case sensitive, so "a" is considered a different type of stone from "A".
	Example 1:
	Input: jewels = "aA", stones = "aAAbbbb"
	Output: 3
	Example 2:
	Input: jewels = "z", stones = "ZZ"
	Output: 0
 */
public class Q771 {
	public static void main(String[] args) {
		
		String jewels = "zA" ,stones = "aAAbbbA";
		/*
		Map<Character , Integer> map = new HashMap<>() ;
		
		for(char ch : stones.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1) ;
		}
		int count = 0 ;
	
		for (int i = 0; i < jewels.length(); i++) {
			if(map.containsKey(jewels.charAt(i)))
			count += map.get(jewels.charAt(i));
		}
		System.out.println(count);
		*/
		
		int count = 0 ;
		Set<Character> set = new HashSet<>();
		for(char ch : jewels.toCharArray())
		{
			set.add(ch);
		}
		
		for (int i = 0; i < stones.length(); i++) {
			if(set.contains(stones.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
