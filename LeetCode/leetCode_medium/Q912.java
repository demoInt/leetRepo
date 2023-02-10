package leetCode_medium;

import java.util.Arrays;

/*
 912. Sort an Array
	Given an array of integers nums, sort the array in ascending order and return it.
	You must solve the problem without using any built-in functions in O(nlog(n)) 
	time complexity and with the smallest space complexity possible.
	Example 1:
	
	Input: nums = [5,2,3,1]
	Output: [1,2,3,5]
	Explanation: After sorting the array, the positions of some numbers are 
	not changed (for example, 2 and 3), while the positions of other numbers are 
	changed (for example, 1 and 5).
	Example 2:
	
	Input: nums = [5,1,1,2,0,0]
	Output: [0,0,1,1,2,5]
	Explanation: Note that the values of nums are not necessairly unique.
 */
public class Q912 {
	public static void main(String[] args) {
		
		int[] nums = {5,2,3,1} ;
		
		divide(nums , 0 , nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	private static void divide(int[] arr , int startIndex , int endIndex)
	{
		if(startIndex >= endIndex)
		{
			return ;
		}
		
		int mid = startIndex + (endIndex - startIndex)/2 ;
		divide(arr, startIndex , mid) ;
		divide(arr , mid+1 , endIndex) ;
		conquer(arr, startIndex , mid , endIndex);
	}
	
	private static void conquer(int[] arr , int startIndex , int mid , int endIndex)
	{
		int[] merged = new int[endIndex - startIndex +1];
		int ind1 = startIndex ;
		int ind2 = mid +1 ;
		int x = 0 ;
		
		while(ind1 <= mid && ind2 <= endIndex)
		{
			if(arr[ind1] <= arr[ind2])
			{
				merged[x++] = arr[ind1++];
			}
			else
			{
				merged[x++] = arr[ind2++];
			}
		}
		
		while(ind1 <= mid)
		{
			merged[x++] = arr[ind1++] ;			
		}
		while(ind2 <= endIndex)
		{
			merged[x++] = arr[ind2++] ;
		}
		
		for (int i = 0,j = startIndex; i < merged.length; i++,j++) {
			arr[j] = merged[i];
		}
	}
}
