package leetCode_easy;
/*
Given an integer n, return true if it is a power of two.
Otherwise, return false.
An integer n is a power of two, if there exists an integer
x such that n == 2x.
Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:
Input: n = 3
Output: false
 */
public class Q231 {
	public static void main(String[] args) {

		int n  = 16;
		long i = 1;
		while (i < n) 
		{	
			i *= 2;
		}
		System.out.println(i == n);	

	}
}
