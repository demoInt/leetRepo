package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 	496. Next Greater Element I
		The next greater element of some element x in an array is the first 
		greater element that is to the right of x in the same array.
		You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a 
		subset of nums2.
		For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and 
		determine the next greater element of nums2[j] in nums2. If there is no next greater 
		element, then the answer for this query is -1.
		Return an array ans of length nums1.length such that ans[i] is the next greater element 
		as described above.
		Example 1:
		Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
		Output: [-1,3,-1]
		Explanation: The next greater element for each value of nums1 is as follows:
		- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, 
		so the answer is -1.
		- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
		- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, 
		so the answer is -1.
		Example 2:
		Input: nums1 = [2,4], nums2 = [1,2,3,4]
		Output: [3,-1]
		Explanation: The next greater element for each value of nums1 is as follows:
		- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
		- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so 
		the answer is -1.
 */

public class Q496 {
	public static void main(String[] args) {
		
		Integer[] findNums = {4,1,2} ;
		Integer[] nums = {1,3,4,2} ;
		/*
		 
		int[] numsFinal = new int[nums1.length];
		
		for (int i = 0; i < numsFinal.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j])
				{
					for (int k = j; k < nums2.length; k++) {
						if(nums2[k] > nums2[j])
						{
							numsFinal[i] = nums2[k] ;
							break ;
						}
						else
						{
							numsFinal[i] = -1 ;
						}
					}
					break ;
				}
				else
				{
					numsFinal[i] = -1 ;
				}
			}
		}
		System.out.println(Arrays.toString(numsFinal));
		*/
		
		 Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
		 
	        Stack<Integer> stack = new Stack<>();
	     
	        for (int num : nums) 
	        {
	            while (!stack.isEmpty() && stack.peek() < num)
	            {
	            	map.put(stack.pop(), num);
	            }
	            stack.push(num);
	        }   
	        for (int i = 0; i < findNums.length; i++)
	            
	        	findNums[i] = map.getOrDefault(findNums[i], -1);
	       
	        System.out.println(Arrays.toString(findNums));
	}
}
