package leetCode_easy;
/*
Given an integer n, return true if it is a power 
of four. Otherwise, return false.
An integer n is a power of four, if there exists an 
integer x such that n == 4x.
Example 1:
Input: n = 16
Output: true
Example 2:
Input: n = 5
Output: false
Example 3:
Input: n = 1
Output: true
 */
public class Q342 {
	public static void main(String[] args) {
		
		int n = 16 ;
		long i = 1 ;
		while(i < n)
		{
			i *= 4 ;
		}
		System.out.println(i==n);
			
		
	}
}
