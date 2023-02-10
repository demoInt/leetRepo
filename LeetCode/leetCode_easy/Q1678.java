package leetCode_easy;
/*
 1678. Goal Parser Interpretation
	You own a Goal Parser that can interpret a string command. The command consists of 
	an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as
	 the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings 
	 are then concatenated in the original order.
	
	Given the string command, return the Goal Parser's interpretation of command.
	Example 1:
	
	Input: command = "G()(al)"
	Output: "Goal"
	Explanation: The Goal Parser interprets the command as follows:
	G -> G
	() -> o
	(al) -> al
	The final concatenated result is "Goal".
	Example 2:
	
	Input: command = "G()()()()(al)"
	Output: "Gooooal"
	Example 3:
	
	Input: command = "(al)G(al)()()G"
	Output: "alGalooG"
 */
public class Q1678 {
	public static void main(String[] args) 
	{
		String s = "G()()()()(al)";	
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			
			if(s.charAt(i) == 'G')
				str += 'G';
			else if(s.charAt(i) == '(')
			{
				if(s.charAt(i+1) == ')')
				{
					str += 'o';
					i++ ;
				}
				else
				{
					str += 'l';
				}
			}
		}
		System.out.println(str);
		//one liner 
//		 return command.replace("G","G").replace("()","o").replace("(al)","al");
		
	}
}
