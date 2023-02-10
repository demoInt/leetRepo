package leetCode_easy;

import java.util.ArrayList;
import java.util.List;

/*
 415. Add Strings
	Given two non-negative integers, num1 and num2 represented as 
	string, return the sum of num1 and num2 as a string.
	You must solve the problem without using any built-in library 
	for handling large integers (such as BigInteger). You must also not 
	convert the inputs to integers directly.
	Example 1:
	Input: num1 = "11", num2 = "123"
	Output: "134"
	Example 2:
	Input: num1 = "456", num2 = "77"
	Output: "533"
	Example 3:
	Input: num1 = "0", num2 = "0"
	Output: "0"
 */
public class Q415 {
	public static void main(String[] args) {
		
		String num1 = "6994" ;
		String num2 = "36";
		
		List<Integer> answer = new ArrayList<>();
		
		int i = num1.length()-1 , j = num2.length()-1 ;
		int carry = 0 ;
		int num = 0 ;
		
		while(i >= 0 && j >= 0)
		{
			num = Integer.parseInt(Character.toString(num1.charAt(i))) + Integer.parseInt(Character.toString(num2.charAt(j))) + carry ;
			answer.add(num%10);
			carry = num / 10;
			num = 0 ;
			i--;
			j--;
		}
		
		while(i >= 0)
		{
			num = Integer.parseInt(Character.toString(num1.charAt(i))) + carry ;
			answer.add(num%10);
			carry =num/10;
			num = 0;
			i--;
		}
		while(j >= 0)
		{
			num = Integer.parseInt(Character.toString(num2.charAt(j))) + carry ;
			answer.add(num%10);
			carry =num/10;
			num = 0;
			j--;
		}
		
		
		System.out.println(answer);
		System.out.println(carry);
		
		if(carry > 0)
		answer.add(carry);
		
		String s = "";
		for (int k = answer.size()-1; k >= 0 ; k--) {
			s += answer.get(k);
		}
		System.out.println(s);
		
	}
}
