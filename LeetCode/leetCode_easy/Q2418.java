package leetCode_easy;

import java.util.Arrays;

/*
 2418. Sort the People
	You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
	
	For each index i, names[i] and heights[i] denote the name and height of the ith person.
	
	Return names sorted in descending order by the people's heights.
	Example 1:
	
	Input: names = ["Mary","John","Emma"], heights = [180,165,170]
	Output: ["Mary","Emma","John"]
	Explanation: Mary is the tallest, followed by Emma and John.
	Example 2:
	
	Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
	Output: ["Bob","Alice","Bob"]
	Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */
public class Q2418 {
	public static void main(String[] args) {
		
		String[] names = {"Mary","John","Emma"};
		int[] heights = {155,185,150};
		
		String[] sNames = new String[names.length] ;
		int n = 0;
		for(String s : names)
		{
			sNames[n++] = s ;
		}
		
		for (int i = 0; i < heights.length; i++) 
		{
			for (int j = 0; j < heights.length-1-i; j++) 
			{
				if(heights[i] > heights[i+1])
				{
					int temp = heights[i];
					heights[i] = heights[i+1];
					heights[i+1] = temp ;
					
					String sTemp = sNames[i];
					sNames[i] = sNames[i+1];
					sNames[i+1] = sTemp ;
				}
			}
		}
				
		System.out.println(Arrays.toString(sNames));
		
		
	}
}
