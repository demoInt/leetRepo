package leetCode_easy;
/*
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Input: s = "()[]{}"
Output: true
 */
public class Q20 {
	public static void main(String[] args) {
		
		String s = "()[]{}";
		String brackets = "({[]})";
		String stack = "";
		boolean isBalanced = true;
		for(int i = 0 ; i < s.length() ; i++ )
		{
			char c1 = s.charAt(i);
			int index = brackets.indexOf(c1);

			if(index != -1)
			{
				if(index <= 2 )
				{
					stack += c1;
				}
				else if(stack.length() != 0 && compareSymmetric(c1 , stack.charAt(stack.length() - 1)))
				{
					stack = stack.substring(0, stack.length()-1);
				}
				else
				{
					isBalanced = false;
					break;
				}

			}
		}
		System.out.println((stack.length() == 0 && isBalanced )? true : false)  ;
	}
	static boolean compareSymmetric(char closing , char opening)
	{
		return opening == '{' && closing == '}' ||
				opening == '[' && closing == ']' || 
				opening == '(' && closing == ')' ;
	}
}

