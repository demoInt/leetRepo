package leetCode_easy;

import java.util.Arrays;

/*
Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1
Input : s = ", , , ,        a, eaefa" ;
Output : 6
 */
public class Q434 {
	public static void main(String[] args) {
		
//		String s = ", , , ,        a, eaefa" ;
		String s ="    foo    bar" ;
		  String[] str = s.split(" ");
	        
	        int count = 0;
	       
	        for (String i : str)
	        {
	        	if( i != "")
	        	{
	        		count++ ;
	        	}
	        }
	      System.out.println(count);
	}
}
