package leetCode_easy;

import java.util.Arrays;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [2,2,1]
Output: 1
 */
public class Q136 {
	public static void main(String[] args) {
		
	//	int[] nums = {2,2,1};
		int[] nums = {4,1,2,1,2};
		int ans=0; //since XOR with 0 returns same number 
	        for(int i=0; i<nums.length; i++){
	            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
	        }
	       System.out.println(ans);  
		
	}
}
