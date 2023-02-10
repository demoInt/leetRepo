package leetCode_medium;

import java.util.Arrays;

/*
 75. Sort Colors
	Given an array nums with n objects colored red, white, or blue, sort 
	them in-place so that objects of the same color are adjacent, with 
	the colors in the order red, white, and blue.
	We will use the integers 0, 1, and 2 to represent the color red, 
	white, and blue, respectively.
	You must solve this problem without using the library's sort function.
	Example 1:
	Input: nums = [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]
	Example 2:
	Input: nums = [2,0,1]
	Output: [0,1,2]
 */
public class Q75 {
	public static void main(String[] args) {
		
		int[] nums = { 2,0,2,1,1,0 };
		divide(nums , 0 , nums.length-1) ;
		System.out.println(Arrays.toString(nums));
	}
	
	private static void divide(int[] nums, int startIndex , int endIndex)
	{
		if(startIndex >= endIndex)
			return  ;
		
		int midIndex = startIndex + (endIndex - startIndex)/2 ;
		divide(nums, startIndex , midIndex);
		divide(nums, midIndex+1, endIndex);
		conquor(nums, startIndex , midIndex , endIndex) ;
	}
	
	private static void conquor(int[] nums , int startIndex , int midIndex , int endIndex)
	{
		int[] merged = new int[endIndex - startIndex + 1] ;
		int ind1 = startIndex ;
		int ind2 = midIndex + 1 ;
		int x = 0 ;
		
		while(ind1 <= midIndex && ind2 <= endIndex )
		{
			if(nums[ind1] <= nums[ind2])
				merged[x++] = nums[ind1++] ;
			else
				merged[x++] = nums[ind2++];
		}
		
		while(ind1 <= midIndex)
			merged[x++] = nums[ind1++] ;
		
		while(ind2 <= endIndex)
			merged[x++] = nums[ind2++] ;
		
		for (int i = 0, j = startIndex; i < merged.length; i++,j++) {
			nums[j] = merged[i] ;
		}
		
	}
}
