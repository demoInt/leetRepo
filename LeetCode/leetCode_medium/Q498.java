package leetCode_medium;

import java.util.Arrays;

/*
 498. Diagonal Traverse
	Given an m x n matrix mat, return an array of all the elements 
	of the array in a diagonal order.
	Example 1
	Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
	Output: [1,2,4,7,5,3,6,8,9]
	Example 2:	
	Input: mat = [[1,2],[3,4]]
	Output: [1,2,3,4]
 */
public class Q498 {
	public static void main(String[] args) {
		
		int[][] mat = {
							{1,2,3},
							{4,5,6},
							{7,8,9}
					  };
		
//		int[][] mat = {
//							{1,2},
//							{3,4},
//					};
		
		int m = mat.length, n = mat[0].length ;
		boolean up = true ;
		int[] arr = new int[m*n];
		int x = 0 ;
		
		int row = 0 , col = 0 ;
		
		while(row < m && col < n)
		{
			if(up)
			{
				while(row > 0 && col < n-1)
				{
					arr[x++] = mat[row][col];
					row-- ;
					col++;
				}
				arr[x++] = mat[row][col] ;
				if(col ==  n-1)
				{
					row++ ;
				}
				else
				{
					col++;
				}
			}
			else
			{
				while(col > 0 && row < m - 1)
				{
					arr[x++] = mat[row][col];
					row++;
					col--;
				}
				arr[x++] =  mat[row][col] ;
				if(row == m-1)
				{
					col++;
				}
				else
				{
					row++ ;
				}
			}
			up = !up ;
		}
		System.out.println(Arrays.toString(arr));		
	}
}
