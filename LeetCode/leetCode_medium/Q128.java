package leetCode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/*
 128. Longest Consecutive Sequence
	Given an unsorted array of integers nums, return the length of the longest 
	consecutive elements sequence.
	You must write an algorithm that runs in O(n) time.
	Example 1:
	Input: nums = [100,4,200,1,3,2]
	Output: 4
	Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
	Therefore its length is 4.
	Example 2:
	Input: nums = [0,3,7,2,5,8,4,6,0,1]
	Output: 9
 */
public class Q128 {
	public static void main(String[] args) {
			
		int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
		
		Arrays.sort(nums);
		int maxCount = 1 ;
		System.out.println(Arrays.toString(nums));
		Stack<Integer> stack  = new Stack<>() ;
		stack.push(nums[0]) ;
		
		for (int i = 1; i < nums.length; i++) 
		{
			if( !stack.isEmpty() &&(stack.peek()+1 == nums[i] || stack.peek() == nums[i]))
			{	
				if(stack.peek() == nums[i])
					continue ;
				stack.push(nums[i]);
				System.out.println(stack);
			}
			else
			{
				if(stack.size() > maxCount)
				{
					maxCount = stack.size();
				}
				stack.clear();
				stack.push(nums[i]);
			}
			
		}
		
		if(stack.size() > maxCount)
			maxCount = stack.size();
		System.out.println(maxCount);
	}
}
