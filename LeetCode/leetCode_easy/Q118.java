package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

/*
 118. Pascal's Triangle
		Given an integer numRows, return the 
		first numRows of Pascal's triangle.
		In Pascal's triangle, each number is the 
		sum of the two numbers directly above it as shown:
		Example 1:
		Input: numRows = 5
		Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
		Example 2:
		Input: numRows = 1
		Output: [[1]]
 */
public class Q118 {
	public static void main(String[] args) {

		int numRows = 5 ;

		List<List<Integer>> list=new ArrayList<>();
		
		List<Integer> row ;
		List<Integer> previous = null ;
		
		for (int i = 0; i < numRows; i++) 
		{
			row = new ArrayList<>();
			
			for (int j = 0; j <= i; j++) 
			{
				if(j == 0 || j == i)
				{
					row.add(1);
				}
				else
				{
					row.add(previous.get(j-1)+previous.get(j));
				}
			}
			previous = row ;
			list.add(row);	
		}
		System.out.println(list);

	}
}
