package leetCode_easy;

import java.util.Arrays;

/*
 2164.  Sort Even and Odd Indices Independently
		You are given a 0-indexed integer array nums. Rearrange the values of nums 
		according to the following rules:

		Sort the values at odd indices of nums in non-increasing order.
		For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. 
		The values at odd indices 1 and 3 are sorted in non-increasing order.
		Sort the values at even indices of nums in non-decreasing order.
		For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. 
		The values at even indices 0 and 2 are sorted in non-decreasing order.
		Return the array formed after rearranging the values of nums.
		Example 1:
		Input: nums = [4,1,2,3]
		Output: [2,3,4,1]
		Explanation: 
		First, we sort the values present at odd indices (1 and 3) in non-increasing order.
		So, nums changes from [4,1,2,3] to [4,3,2,1].
		Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
		So, nums changes from [4,1,2,3] to [2,3,4,1].
		Thus, the array formed after rearranging the values is [2,3,4,1].
		Example 2:		
		Input: nums = [2,1]
		Output: [2,1]
		Explanation: 
		Since there is exactly one odd index and one even index, no rearrangement of values 
		takes place.
		The resultant array formed is [2,1], which is the same as the initial array. 
 */
public class Q2164 {
	public static void main(String[] args) {
		
		int[] nums = {4,1,2,3};
		
		for (int i = 0; i < nums.length - 2; i+=2) {
			for (int j = i+2; j < nums.length; j += 2) {
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp ;
				}
			}
		}
		
		int start = (nums.length-1) % 2 ==0?nums.length-2 : nums.length-1; 
		for (int i = start; i > 0; i-=2) {
			for (int j = i-2; j >= 0; j -= 2) {
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp ;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
