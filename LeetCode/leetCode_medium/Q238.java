package leetCode_medium;

import java.util.Arrays;
/*
238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class Q238 {
	public static void main(String[] args) {
/*
		int[] a = {1,2,3,4};
		int[] prod = new int[a.length];
		int product = 1 ;
		boolean secondZeroFound = false;
		int index = -1 ;
		
		for (int i = 0; i < a.length; i++) {
		
			if(a[i] == 0)
			{
				if(SecondZeroFound)
				{
					return prod ;
				}
				secondZeroFound = true ;
				index = i ;
			}
			else
			{
				product = product*a[i];
			}
		}
		
		if(secondZeroFound)
		{
			prod[index] = product ; 
		}
		else
		{
			for (int i = 0; i < prod.length; i++) {
				prod[i] = product/prod[i];
			}
		}
		return prod;
*/
	}
}
