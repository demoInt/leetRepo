package leetCode_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 974. Subarray Sums Divisible by K
	  Given an integer array nums and an 
	  integer k, return the number of non-empty subarrays that have a sum divisible by k.
	  A subarray is a contiguous part of an array.		
	  Example 1:
	  Input: nums = [4,5,0,-2,-3,1], k = 5
	  Output: 7
	  Explanation: There are 7 subarrays with a sum divisible by k = 5:
	  [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
	  Example 2:
	  Input: nums = [5], k = 9
	  Output: 0
 */
public class Q974 {
	public static void main(String[] args) {
		
	
//		int count = 0, sum  = 0 ;
//		for (int i = 0; i < nums.length; i++) {
//			sum = 0 ;
//			for (int j = i; j < nums.length; j++) {
//				sum += nums[j] ;
//				if(sum % k == 0)
//				{
//					count++ ;
//				}
//			}
//		}
//		System.out.println(count);
		
/*		
// Use the HashMap to record the frequency of all the prefix sum remainders.
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0, remainder; i < nums.length; i++) {
			if (i > 0) nums[i] += nums[i - 1];
// Note that the integer in 'nums' can be negative.
// Thus, we need to adjust the negative remainder to positive remainder.
// Below accounts for both negative and positive remainders.
// We can also check if the remainder is negative, then add a 'k' to make the remainder positive.
// For Example, nums = [-2,3,2], k = 5,
// remainder for the prefix sum of [-2,1,3] are -2, 1 and 3 respectively.
// We know that [3,2] sum to 5, which is divisible by 5.
// After converting -2 to 3, by adding 5, it has the same remainder with prefix sum 3.
			remainder = (nums[i] % k + k) % k;  
			map.put(remainder, map.getOrDefault(remainder, 0) + 1);
		}
// The result contains all the prefix sum with remainder 0,
// as all the prefix sum with remainder of 0 is itself divisible by 'k'.
// However, do note that the prefix sum with remainder 0 also able to form subarray sums that is divisible by 'k'
// with one another, which will be calculated next.
// For Example: nums = [5,5,5,5], k = 5,
// The prefix sum of [5,10,15,20] are themselves divisible by 5, while also forming subarray sums divisible by 5
// with 10 [5,5] - 5 [5] == 5, 15 [5,5,5] - 5 [5] == 10, etc.
		int result = map.getOrDefault(0, 0);

// The prefix sums with the same remainder can form subarray sums that is divisible by 'k' with each other.
		for (int frequency : map.values())
			result += frequency * (frequency - 1) / 2;

		System.out.println(result);
*/		
		
		int[] nums = {4,5,0,-2,-3,1} ;
		int k = 5 ;
		Map<Integer , Integer> map = new HashMap<>() ;
		map.put(0, 1);
		int sum = 0 ;
		int rem = 0 ;
		int ans = 0 ;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			rem = sum % k ;
			if(rem < 0)
			{
				rem += k ;
			}
			
			if(map.containsKey(rem))
			{	
				ans += map.get(rem) ;
				map.put(rem, map.get(rem)+1) ;
			}
			else
			{
				map.put(rem, 1) ;
			}
		}
		System.out.println(ans);
		
	}
}
