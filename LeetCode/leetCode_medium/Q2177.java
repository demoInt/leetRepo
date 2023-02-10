package leetCode_medium;

import java.util.Arrays;

/*
 2177. Find Three Consecutive Integers That Sum to a Given Number
		Given an integer num, return three consecutive integers (as a sorted array) that sum to num. 
		If num cannot be expressed as the sum of three consecutive integers, return an empty array.
		Example 1:
		Input: num = 33
		Output: [10,11,12]
		Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
		10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
		Example 2:
		Input: num = 4
		Output: []
		Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
 */
public class Q2177 {
	public static void main(String[] args) {
	
		long num = 33 ;
		
	/*	
		for (int i = 1; i < 30; i++) 
		{
			if((i + i + 1 + i + 2) == 33)
			{
				System.out.println(i);
				break; 
			}
		}
	*/
		
//		long l = num/3;
//		long[] lArr = {l-1 , l , l+1};
//		System.out.println(Arrays.toString(lArr));
		
	}
}
