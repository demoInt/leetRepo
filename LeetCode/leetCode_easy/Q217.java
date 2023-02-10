package leetCode_easy;

import java.util.HashSet;

/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true
 */
public class Q217 {
	public static void main(String[] args) {
		
		int[] nums = {2,3,1};
		boolean flag = false;

        HashSet set = new HashSet();
        for(int i = 0 ; i < nums.length ; i++)
        {
            boolean b1 = set.add(nums[i]);
            if(!b1)
            {
                flag = true;
                break;
            }
        }
    
    System.out.println(flag);
		
	}
}
