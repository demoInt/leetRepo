package leetCode_medium;
/*
 48.Rotate Image
	You are given an n x n 2D matrix representing an image, rotate the image by 90 
	degrees (clockwise).
	You have to rotate the image in-place, which means you have to modify the input 
	2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
	Example 1:
	Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
	Output: [[7,4,1],[8,5,2],[9,6,3]]
	Example 2:
	Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
	Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */
public class Q48 
{
	public static void main(String[] args) {
		
		int[][] matrix = { {1,2,3},
				           {4,5,6},
				           {7,8,9}
				         };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp ;
			}
		}
		
		int left, right;		
		for (int i = 0; i < matrix.length; i++) {
			left = 0 ;
			right = matrix.length- 1 ;
			while(left < right)
			{
				int temp = matrix[i][left] ;
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp ;
				left++;
				right--;
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
/*
 public static void main(String[] args) 
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0 ; i<matrix.length ; i++){
			for(int j = i ; j<matrix.length ; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp ;
			}
		}
		for(int i = 0 ; i<matrix.length; i++){
			int start = 0;
			int end = matrix[i].length -1;
			while(start < end){
				matrix[i][start] = matrix[i][start] + matrix[i][end];
				matrix[i][end] = matrix[i][start] - matrix[i][end];
				matrix[i][start] = matrix[i][start] - matrix[i][end];
				start++;
				end--;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
 	
*/