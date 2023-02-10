package leetCode_easy;

import java.util.Arrays;

/*
 1929.  Concatenation of Array
		Given an integer array nums of length n, you want to create an array ans of 
		length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).		
		Specifically, ans is the concatenation of two nums arrays.
		Return the array ans.
		Example 1:
		Input: nums = [1,2,1]
		Output: [1,2,1,1,2,1]
		Explanation: The array ans is formed as follows:
		- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
		- ans = [1,2,1,1,2,1]
		Example 2:		
		Input: nums = [1,3,2,1]
		Output: [1,3,2,1,1,3,2,1]
		Explanation: The array ans is formed as follows:
		- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
		- ans = [1,3,2,1,1,3,2,1]
 */
public class Q1929 {
	public static void main(String[] args) {
		
		int nums[] = {1,2,1};
		
		int[] numsConcat = new int[nums.length*2];
		int i = 0 ;		
		while(i < nums.length)
		{
			numsConcat[i] = nums[i] ;
			numsConcat[nums.length+i] = nums[i] ;
			i++;
		}
		System.out.println(Arrays.toString(numsConcat));
		
		
	}
}
