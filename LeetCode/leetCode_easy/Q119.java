package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

/*
 119. Pascal's Triangle II
 		Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
		In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:		
		Example 1:
		Input: rowIndex = 3
		Output: [1,3,3,1]
		Example 2:
		Input: rowIndex = 0
		Output: [1]
		Example 3:
		Input: rowIndex = 1
		Output: [1,1]
 */
public class Q119 {
	public static void main(String[] args) {
		
		int rowIndex = 0 ;
		
		List<Integer> row ;
		List<Integer> previous = null ;
		
		for (int i = 0; i < rowIndex+1 ; i++) 
		{
			row = new ArrayList<>();
		
			for (int j = 0; j <= i; j++) 
			{
				if(j == 0 || j == i)
					row.add(1);
				else
					row.add(previous.get(j-1) + previous.get(j)) ;
			}
			previous = row ;
		}
		System.out.println(previous);
	}
}
