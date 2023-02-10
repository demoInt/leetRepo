package leetCode_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 219. Contains Duplicate II
		Given an integer array nums and an integer k, return true if there are 
		two distinct indices i and j in the array such that nums[i] == nums[j] and 
		abs(i - j) <= k.
		Example 1:
		Input: nums = [1,2,3,1], k = 3
		Output: true
		Example 2:
		Input: nums = [1,0,1,1], k = 1
		Output: true
		Example 3:
		Input: nums = [1,2,3,1,2,3], k = 2
		Output: false
 */
public class Q219 {
	public static void main(String[] args) {

		int[] nums = {1,0,1,1};
		int k = 1 ;

		 HashMap<Integer,Integer> mp = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	           if(mp.containsKey(nums[i])){
//	               if(Math.abs(i-mp.get(nums[i]))<=k) 
//	            	   return true;
	           }
	           mp.put(nums[i],i);
	        }
//	        return false;
	}
}
