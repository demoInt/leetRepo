package leetCode_medium;

import java.util.HashSet;
import java.util.Set;

/*
 73. Set Matrix Zeroes
 	Given an m x n integer matrix matrix, if an element is 0, 
 	set its entire row and column to 0's.	
	You must do it in place.
	Example 1:
	Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
	Output: [[1,0,1],[0,0,0],[1,0,1]]
	Example 2:
	Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
	Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
public class Q73 {
	public static void main(String[] args) {
		
		int[][] matrix = {  
							{1,2,3,4},
							{5,0,7,8},
							{0,10,11,12},
							{13,14,15,0}
						};
			
		int m = matrix.length ;
		int n = matrix[0].length ;
		
		Set<Integer> row = new HashSet<>();
		Set<Integer> col = new HashSet<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j] == 0)
					{
						row.add(i);					
						col.add(j);
					}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(row.contains(i) || col.contains(j))
				{
					matrix[i][j] = 0 ;
				}
			}
		}				
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
