package leetCode_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 	1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Q1 {
	public static void main(String[] args) 
	{
		int[] nums = {2,7,11,15,9,5,4,1,8,9,0};
		int target = 9;
		int n=nums.length;
	
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) 
		{
			if(map.containsKey(target - nums[i]))
			{
				System.out.println(nums[i] +" "+ (target-nums[i]));
			}
			map.put(nums[i], i);
		}
		
		System.out.println(map);
	}
}
