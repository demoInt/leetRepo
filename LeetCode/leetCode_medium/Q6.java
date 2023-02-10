package leetCode_medium;

import java.util.Arrays;

/*
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */
public class Q6 {
	public static void main(String[] args) 
	{
//		String s = "PAYPALISHIRING" ;
		String s = "AB" ;
		
		int currRow = 0 ;
		int row = 1 ;
		boolean flag = true ;
		String[] zigzag = new String[row] ;
		Arrays.fill(zigzag, "");
		
		for (int i = 0; i < s.length(); i++) 
		{
			zigzag[currRow] += s.charAt(i);
			if(currRow == row-1)
			{
				flag = false ;
			}
			else if(currRow == 0)
			{
				flag = true ;
			}
			
			if(flag)
			{
				currRow++ ;
			}
			else
			{
				currRow-- ;
			}
		}
		String str = "" ;
		for(String st : zigzag)
		{
			str += st ;
		}
		System.out.println(str);
	}
}
