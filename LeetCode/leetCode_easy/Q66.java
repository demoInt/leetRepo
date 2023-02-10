package leetCode_easy;

import java.util.Arrays;

/*
 You are given a large integer represented as an integer array digits, where each digits[i] is the 
 i'th digit of the integer. The digits are ordered from most significant to least significant in 
 left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class Q66 {
	public static void main(String[] args) {

		int[] digits = {9,8,7,6,5,4,3,2,1,1};   //expected output - {9,8,7,6,5,4,3,2,1,1}
//		int[] digits = {8,1,9,9};   		// 8,2,0,0

		int n = digits.length;

		for(int i = n-1; i >= 0; i--) 
		{
			if(digits[i] < 9) 
			{
				digits[i]++;
				System.out.println( " vlaue of i "+ i + " and digits "+digits[i]);              //check from pt of wiew of return 
			}
			digits[i] = 0;                    //if a digit fount = 9 then it should carry so it will become 0 and the left one will +1
		}
		System.out.println(Arrays.toString(digits));

		// below code is only for if all the elements are 9 then creating another array of size +1 and inseting 1 a first position
		int[] newNumber = new int [n+1];
		newNumber[0] = 1 ;
		System.out.println(newNumber);


	}
	
}
