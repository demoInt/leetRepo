package leetCode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 54. Spiral Matrix
	Given an m x n matrix, return all elements of the matrix in spiral order.
	Example 1:
	Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
	Output: [1,2,3,6,9,8,7,4,5]
	Example 2:
	Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
	Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class Q54 {
	public static void main(String[] args) {
		
//		int[][] matrix = 	{
//								{1,2,3,4},
//								{5,6,7,8},
//								{9,10,11,12}
//							};
		
		int[][] matrix = 	{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		List<Integer> list = new ArrayList<>();		
		int row = 0 ;
		int col = 0 ;
		int endRow = matrix.length-1 ;
		int endCol = matrix[0].length-1;
		
		while(row <= endRow && col <= endCol)
		{
			for (int i = col; i <= endCol; i++) {
				list.add(matrix[row][i]);
			}
			
			for (int i = row + 1; i <= endRow; i++) {
				list.add(matrix[i][endCol]);
			}
			
			for (int i = endCol - 1; i >= col; i--) {
				if(row == endRow)
					break;
				list.add(matrix[endRow][i]);
			}
			
			for (int i = endRow - 1; i >= row + 1; i--) {
				if(col == endCol)
					break ;
				list.add(matrix[i][col]);
			}
			
			col++;
			row++;
			endCol-- ;
			endRow-- ;
		}
		
		System.out.println(list);
		
	}
}
