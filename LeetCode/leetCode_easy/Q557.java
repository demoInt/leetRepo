package leetCode_easy;

import java.util.Stack;

/*
	 557. Reverse Words in a String III
		  Given a string s, reverse the order of characters in each word within a 
		  sentence while still preserving whitespace and initial word order.	
		  Example 1:		
		  Input: s = "Let's take LeetCode contest"
		  Output: "s'teL ekat edoCteeL tsetnoc"
		  Example 2:
		  Input: s = "God Ding"
		  Output: "doG gniD"
 */
public class Q557 {
	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";
		String str = "";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i) != ' ')
			{
				stack.push(s.charAt(i));
			}
			else
			{	
					while(!stack.isEmpty())
					{
						str += stack.pop();
					}
			}
			
			if(s.charAt(i)==' ')
			{
				str += s.charAt(i);
			}
		}
		while(!stack.isEmpty())
		{
			str += stack.pop();
		}
		System.out.println(str);		
	}
}
