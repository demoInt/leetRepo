package leetCode_medium;
/*
 240. Search a 2D Matrix II
	Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
	Integers in each row are sorted in ascending from left to right.
	Integers in each column are sorted in ascending from top to bottom.
	Example 1:
	Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
	Output: true
	Example 2:	
	Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
	Output: false
 */
public class Q240 {
	public static void main(String[] args) {

		int[][] matrix = {
				{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24},
				{18,21,23,26,30}
		};

		int target = 11 ;
		int n = matrix.length, m=matrix[0].length - 1;
		int i=0, j = m;
		
		while(i < n && j >= 0)
		{
			if(target == matrix[i][j])
			{    
				System.out.println(true);
				break;
			}
			if(target > matrix[i][j])
				i+=1;
			else
				j-=1;
		}
		System.out.println(false);
	}
}

