package leetCode_hard;

import java.util.Stack;

/*
 32. Longest Valid Parentheses
	Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
	substring.
	Example 1:

	Input: s = "(()"
	Output: 2
	Explanation: The longest valid parentheses substring is "()".
	Example 2:

	Input: s = ")()())"
	Output: 4
	Explanation: The longest valid parentheses substring is "()()".
	Example 3:

	Input: s = ""
	Output: 0
 */
public class Q32 {
	
	public static void main(String[] args) {

		String s = "(((()())" ;
	
		Stack<Integer> data=new Stack<>();
		
		data.push(-1);
		
		int max=0;

		for(int i=0;i<s.length();i++){
		
			char c=s.charAt(i);
			
			if(c=='('){
				data.push(i);
			}
			
			else{
				data.pop();
				if(data.empty())
				{
					data.push(i);
				}
				else
				{
					max=Math.max(max,i-data.peek());
				}
			} 
		}
		System.out.println(max);
	}
}
