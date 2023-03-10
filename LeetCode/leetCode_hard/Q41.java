package leetCode_hard;

import java.util.Arrays;

/*
 41. First Missing Positive
 Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */
public class Q41 {
	public static void main(String[] args) {

		int  a [] = {1,7,8,9,11,12};

		int [] temp = new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			if(a[i] <= a.length && a[i] >0)
			{
				temp[a[i]-1] = a[i];
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			if (temp[i] == 0) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(temp.length +1);
		
	}
}
