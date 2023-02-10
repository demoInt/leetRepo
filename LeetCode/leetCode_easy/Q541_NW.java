package leetCode_easy;

import java.util.Stack;

/*
 541. Reverse String II
	Given a string s and an integer k, reverse the first k 
	characters for every 2k characters counting from the start of the string.
	If there are fewer than k characters left, reverse all of them. 
	If there are less than 2k but greater than or equal to k characters, 
	then reverse the first k characters and leave the other as original.
	Example 1:
	Input: s = "abcdefg", k = 2
	Output: "bacdfeg"
	Example 2:
	Input: s = "abcd", k = 2
	Output: "bacd"
 */
public class Q541_NW {
	public static void main(String[] args) {
		
		String s  = "abcdefg" ;
		int k = 2 ;
		int n = 0 ;
		String str = "" ;
		
		for (int i = 0; i < s.length(); i++) {
			
			if( i == 2*k*n)
			{
				String revStr = rev(s , i , k) ;
				str += revStr ;
				n++ ;
			}
			else
			{
				str += s.charAt(i) ;
			}
		}
		
//   	System.out.println(str);
		
	}
	
	private static String rev(String s , int i , int k)
	{
		String str = "";
		int n = k + i ;
		System.out.println(n +"   "+i);
		for (int j = i; j < n ; j++) 
		{
			str += s.charAt(n-1-i) ;
//			System.out.println(s.charAt(n-1-i));
		}
		System.out.println("returning  "+ str );
		return str ;
	}
}
