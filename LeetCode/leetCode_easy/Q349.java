package leetCode_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
	 Given two integer arrays nums1 and nums2, return an 
	 array of their intersection. Each element in the 
	 result must be unique and you may return the result 
	 in any order.
	Example 1:
	
	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]
	Example 2:
	
	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]
	Explanation: [4,9] is also accepted.
 */
public class Q349 
{
	public static void main(String[] args) 
	{			
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				
				if(nums1[i] == nums2[j])
				{
					set.add(nums1[i]);
				}
			}
		}
		int k = 0;
		int[] retArr = new int[set.size()];
		for(int s : set)
		{
			retArr[k++] = s ;
		}
		System.out.println(Arrays.toString(retArr));
	}
}
