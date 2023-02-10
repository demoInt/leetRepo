package leetCode_medium;

import java.util.Arrays;

/*
 2149. Rearrange Array Elements by Sign
		You are given a 0-indexed integer array nums of even length consisting of 
		an equal number of positive and negative integers.		
		You should rearrange the elements of nums such that the modified array 
		follows the given conditions:
		Every consecutive pair of integers have opposite signs.
		For all integers with the same sign, the order in which they were present 
		in nums is preserved.
		The rearranged array begins with a positive integer.
		Return the modified array after rearranging the elements to satisfy 
		the aforementioned conditions.
		Example 1:
		Input: nums = [3,1,-2,-5,2,-4]
		Output: [3,-2,1,-5,2,-4]
		Explanation:
		The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
		The only possible way to rearrange them such that they satisfy all conditions 
		is [3,-2,1,-5,2,-4].
		Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect 
		because they do not satisfy one or more conditions.  
		Example 2:
		Input: nums = [-1,1]
		Output: [1,-1]
		Explanation:
		1 is the only positive integer and -1 the only negative integer in nums.
		So nums is rearranged to [1,-1].
 */
public class Q2149 {
	public static void main(String[] args) {
		
		int[] nums = {3,1,-2,-5,2,-4};		
//		int posCount = 0 ,negCount = 0 ;
//		
//		for(int num : nums)
//		{
//			if(num < 0 )
//				negCount++ ;
//			else
//				posCount++ ; 
//		}
//		
//		int[] posNums = new int[posCount] ;
//		int[] negNums = new int[negCount] ;
//		int i = 0 , j = 0, k = 0 ;
//		while(i < nums.length)
//		{
//			if(nums[i] < 0)
//			{
//				negNums[j++] = nums[i++];
//			}
//			else
//			{
//				posNums[k++] = nums[i++];
//			}
//		}
//		
//		int[] target = new int[nums.length];
//		i = j = k = 0;
//		while(i < target.length)
//		{
//			target[i++] = posNums[j++];
//			target[i++] = negNums[k++];
//		}
		
		int[] target = new int[nums.length] ;
		
		int posIndex = 0 , negIndex = 1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < 0 )
			{
				target[negIndex] = nums[i] ;
				negIndex += 2;
			}
			else
			{
				target[posIndex] = nums[i];
				posIndex += 2 ;
			}
		}		
		System.out.println(Arrays.toString(target));
		
	}
}
