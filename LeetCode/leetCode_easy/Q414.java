package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 414. Third Maximum Number
		Given an integer array nums, return the third distinct maximum number 
		in this array. If the third maximum does not exist, return the maximum number.
		Example 1:
		Input: nums = [3,2,1]
		Output: 1
		Explanation:
		The first distinct maximum is 3.
		The second distinct maximum is 2.
		The third distinct maximum is 1.
		Example 2:
		Input: nums = [1,2]
		Output: 2
		Explanation:
		The first distinct maximum is 2.
		The second distinct maximum is 1.
		The third distinct maximum does not exist, so the maximum (2) is 
		returned instead.
		Example 3:
		Input: nums = [2,2,3,1]
		Output: 1
		Explanation:
		The first distinct maximum is 3.
		The second distinct maximum is 2 (both 2's are counted together since they 
		have the same value).
		The third distinct maximum is 1.
 */
public class Q414 {
	public static void main(String[] args) {
		
		int[] nums = {1,2,2,2,2,2,5,5,3,5};
		
		Set<Integer> set = new TreeSet<>();
		for(int n : nums)
		{
			set.add(n);
		}
		
		List<Integer> list = new ArrayList<>(set) ;
		
		if(list.size() < 3)
		{
			System.out.println(list.get(list.size()-1));
		}
		else
		{
			System.out.println(list.get(list.size()-3));
		}
	}
}
