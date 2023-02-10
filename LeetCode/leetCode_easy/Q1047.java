package leetCode_easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
 1047. Remove All Adjacent Duplicates In String
		You are given a string s consisting of lowercase English letters. 
		A duplicate removal consists of choosing two adjacent and equal 
		letters and removing them.
		We repeatedly make duplicate removals on s until we no longer can.
		Return the final string after all such duplicate removals have been made.
		It can be proven that the answer is unique.
		Example 1:
		Input: s = "abbaca"
		Output: "ca"
		Explanation: 
		For example, in "abbaca" we could remove "bb" since the letters are adjacent 
		and equal, and this is the only possible move.  The result of this move is that 
		the string is "aaca", of which only "aa" is possible, so the final string is "ca".
		Example 2:
		Input: s = "azxxzy"
		Output: "ay"
 */
public class Q1047 {
	public static void main(String[] args) {
		
		String s = "abbaca" ;
		String str = "";
		Stack<Character> stack = new Stack<>() ;
		
		stack.push(s.charAt(0)) ;
		
		for (int i = 1; i < s.length(); i++) 
		{
			if(!stack.isEmpty() && stack.peek() == s.charAt(i))
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty())
		{
			sb.append(stack.pop());
		}
		System.out.println(sb.reverse());
		
	}
}
