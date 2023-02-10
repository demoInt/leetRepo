package leetCode_easy;
/*
 58. Length of Last Word
 Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
public class Q58 {
	public static void main(String[] args) {
		
//		String s = "   fly me   to   the moon  ";
		String s = "Hello World";
		String sn = "";

		for (int i = s.length()-1; i >= 0 ; i--) 
		{
			if(s.charAt(i) != ' ')
			{
				sn = s.substring(s.lastIndexOf(" ",i)+1 , i+1);
				break;
			}
		}
		System.out.println(sn+"  :  "+sn.length());
	}
}
