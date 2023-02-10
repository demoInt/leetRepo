package leetCode_medium;

import java.util.ArrayList;
import java.util.List;

/*
 46. Permutations
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:
Input: nums = [1]
Output: [[1]]
 */
public class Q46 {
	public static void main(String[] args) 
	{
		List<List<Integer>> list = new ArrayList<>() ;
		int[] a = {1,2,3,4};
		permute(a,0, list);
		
		System.out.println(list);
				
	}
	private static void permute(int[] a , int n, List list)
	{
		if(n == a.length - 1)
		{
			List<Integer> list2 = new ArrayList<>() ;
			
			for (int i = 0; i < a.length; i++) 
			{
				list2.add(a[i]);
			}
			list.add(list2);
		}
		else
		{
			for (int i = n; i < a.length; i++) 
			{
				swap(a, n ,i);
				permute(a, n+1 , list);
				swap(a, n, i);
			}
		}
	}
	private static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
