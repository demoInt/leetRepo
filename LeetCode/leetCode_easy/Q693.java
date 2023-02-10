package leetCode_easy;

import java.util.Stack;

/*
 693. Binary Number with Alternating Bits
	Given a positive integer, check whether it has alternating 
	bits: namely, if two adjacent bits will always have different values.
	Example 1:
	Input: n = 5
	Output: true
	Explanation: The binary representation of 5 is: 101
	Example 2:
	Input: n = 7
	Output: false
	Explanation: The binary representation of 7 is: 111.
	Example 3:
	Input: n = 11
	Output: false
	Explanation: The binary representation of 11 is: 1011.
 */
public class Q693 {
	public static void main(String[] args) {

		int n = 5 ;
		String s = Integer.toBinaryString(n);
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if(!stack.isEmpty() && stack.peek() == s.charAt(i))
				{System.out.println(false);}
			else
				stack.push(s.charAt(i)) ;
		}
	}
}
