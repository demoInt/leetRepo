package leetCode_medium;
import java.util.Arrays;
/*
 34. Find First and Last Position of Element in Sorted Array
	Given an array of integers nums sorted in non-decreasing order, find 
	the starting and ending position of a given target value.
	If target is not found in the array, return [-1, -1].
	You must write an algorithm with O(log n) runtime complexity.
	Example 1:
	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]
	Example 2:
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
	Example 3:
	Input: nums = [], target = 0
	Output: [-1,-1]
 */
public class Q34 {
	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,10};
		int target = 7;
		int[] re = new int[2];
		re[0] = -1;
		re[1] = -1;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] == target)
			{
				if(re[0] == -1)
				{
					re[0] = i;
					re[1] = re[0];              //for special cases ex nums= {1} , target = 1,output {0,0}
				}
				else
				{
					re[1] = i;
				}
			}
		}
		System.out.println(Arrays.toString(re));
		
		
	}
}
