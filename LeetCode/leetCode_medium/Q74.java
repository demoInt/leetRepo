package leetCode_medium;
/*
 74. Search a 2D Matrix
	You are given an m x n integer matrix matrix 
	with the following two properties:
	Each row is sorted in non-decreasing order.
	The first integer of each row is greater than the 
	last integer of the previous row.
	Given an integer target, return true if target 
	is in matrix or false otherwise.
	You must write a solution in O(log(m * n)) time complexity.
	Example 1:
	Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
	Output: true
	Example 2:
	Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
	Output: false
 */
public class Q74 {
	public static void main(String[] args) {
		
		int[][] matrix = {
								{1,3,5,7},
								{10,11,16,20},
								{23,30,34,60}
					   	 } ;
		int target = 6 ;
//	     int n = matrix.length, m=matrix[0].length - 1;
//			int i=0, j = m;
//			
//			while(i < n && j >= 0)
//			{
//				if(target == matrix[i][j])
//				{    
//					return true ;
//				}
//				if(target > matrix[i][j])
//					i+=1;
//				else
//					j-=1;
//			}
//	        return false ;
		
		
		int m = matrix.length ,  n = matrix[0].length ;
		int row = 0 , col = n-1 ;
		
		while(row < m && col >= 0 )
		{
			if(matrix[row][col] == target)
			{
				System.out.println(true);
				break ;
			}
			if(target > matrix[row][col])
				row++;
			else
				col-- ;			
		}
		
		
	}
	//leetcode method
	public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0) return false;

        int n=matrix.length;
        int m=matrix[0].length;

        //set the low value and high value by indices.
        int low=0,high=(n*m)-1;
        
        while(low<=high){
            int mid=(low+(high-low)/2);

            //calculating the (rowIndex,colIndex) where mid is right now.
            int rInd=mid/m;
            int cInd=mid%m;

            //Simple Binary Search
            if(matrix[rInd][cInd]==target){
                return true;
            }
            else if(matrix[rInd][cInd]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return false;
        
    }
}
