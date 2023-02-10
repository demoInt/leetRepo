package leetCode_easy;

import java.util.HashMap;
import java.util.Map;

/*
 1512. Number of Good Pairs
		Given an array of integers nums, return the number of good pairs.
		A pair (i, j) is called good if nums[i] == nums[j] and i < j.
		Example 1:
		Input: nums = [1,2,3,1,1,3]
		Output: 4
		Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
		Example 2:
		Input: nums = [1,1,1,1]
		Output: 6
		Explanation: Each pair in the array are good.
		Example 3:
		Input: nums = [1,2,3]
		Output: 0
 */
public class Q1512 {
	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,1,1,3};
		int[] nums = {1,1,1,1};
		
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			int m = map.getOrDefault(nums[i], 0) ;
			count += m;
			map.put(nums[i], m+1);
		}
		System.out.println(count);
	}
}
