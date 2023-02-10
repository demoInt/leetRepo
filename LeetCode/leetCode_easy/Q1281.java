package leetCode_easy;
/*
 1281. Subtract the Product and Sum of Digits of an Integer
		Given an integer number n, return the difference between 
		the product of its digits and the sum of its digits.
		Example 1:
		
		Input: n = 234
		Output: 15 
		Explanation: 
		Product of digits = 2 * 3 * 4 = 24 
		Sum of digits = 2 + 3 + 4 = 9 
		Result = 24 - 9 = 15
		Example 2:
		
		Input: n = 4421
		Output: 21
		Explanation: 
		Product of digits = 4 * 4 * 2 * 1 = 32 
		Sum of digits = 4 + 4 + 2 + 1 = 11 
		Result = 32 - 11 = 21
 */
public class Q1281 {
	public static void main(String[] args) {
		
		int n = 234 ;
		int s = n ;
		int p = n ;
		int prod = 1;
		int sum = 0;
		
		while(s != 0)
		{
			prod *= (s%10);
			sum += (p%10) ;
			s /= 10 ;
			p /= 10 ;
		}
		System.out.println(prod - sum);
		
	}
}
