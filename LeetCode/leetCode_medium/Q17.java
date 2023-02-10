package leetCode_medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*	
 17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the 
number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not 
map to any letters.
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:
Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 */
public class Q17 {
	public static void main(String[] args) {
		
		String digits = "23";
		
		LinkedList<String> output_arr = new LinkedList<>();

//		if(digits.length() == 0)
//			return output_arr ;
		
		output_arr.add("");
		
		String[] char_map = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		for (int i = 0; i < digits.length(); i++) {
			
			int index = Character.getNumericValue(digits.charAt(i));
			
			while(output_arr.peek().length() == i)
			{
				String permutation = output_arr.remove();
				for(char c : char_map[index].toCharArray())
				{
					output_arr.add(permutation + c);
				}
			}
		}
		
		System.out.println(output_arr);
	}
}
