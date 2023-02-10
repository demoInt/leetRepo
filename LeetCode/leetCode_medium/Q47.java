package leetCode_medium;

import java.util.ArrayList;
import java.util.List;

/*
 47. Permutations II
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Q47 {
	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		List<List<Integer>> list = new ArrayList<>();
		
		permute(nums , 0 , list);
		System.out.println(list);
		
	}
	private static void permute(int[] nums , int n, List list)
	{
		if(n == nums.length-1)
		{
			List<Integer> permute = new ArrayList<>();
			
			for (int i = 0; i < nums.length; i++) {
				permute.add(nums[i]);
			}
			
			if(!(list.contains(permute)))
			{
				list.add(permute);
			}
		}
		else
		{
			for (int i = n; i < nums.length; i++) {
				
				swap(nums,n,i);
				permute(nums ,n+1 , list );
				swap(nums , n ,i);
			}
		}
	}
	private static void swap(int[] a , int i , int j)
	{
		int temp = a[i] ;  
		a[i] = a[j] ;
		a[j] = temp ;
	}
}
