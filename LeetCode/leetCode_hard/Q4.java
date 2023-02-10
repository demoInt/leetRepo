package leetCode_hard;

import java.util.Arrays;
/*
 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class Q4 {
	public static void main(String[] args) {

		int[] nums1 = {1,2};
		int[] nums2 = {3,4};

		int i = 0, j = 0 , k = 0 ;
		int[] num = new int[nums1.length + nums2.length];
		
		while(i < nums1.length && j < nums2.length)
		{
			if(nums1[i] < nums2[j])
			{
				num[k++] = nums1[i++];
			}
			else
			{
				num[k++] = nums2[j++];
			}
		}
		
		while(i < nums1.length)
		{
			num[k++] = nums1[i++]; 
		}
		
		while(j < nums2.length)
		{
			num[k++] = nums2[j++];
		}

		System.out.println(Arrays.toString(num));
		double median ;
		
		if(num.length % 2 == 0)
		{
			median = (double)(num[(num.length)/2]+ num[((num.length)/2)-1])/2;
			System.out.println(num[(num.length)/2]);
			System.out.println(num[((num.length)/2)-1]);
		}        
		else
		{
			median = num[num.length/2];
		}
		
		System.out.println(median);
	}
}
