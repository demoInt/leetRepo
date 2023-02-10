package leetCode_medium;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 43. Multiply Strings
		Given two non-negative integers num1 and num2 represented 
		as strings, return the product of num1 and num2, also represented as a string.
		Note: You must not use any built-in BigInteger library or 
		convert the inputs to integer directly.
		Example 1:
		Input: num1 = "2", num2 = "3"
		Output: "6"
		Example 2:
		Input: num1 = "123", num2 = "456"
		Output: "56088"
 */
public class Q43 {
	public static void main(String[] args) {
		
//		String num1 = "123" ;
		String num1 = "123456789" ;
//		String num2 = "456" ;
		String num2 = "987654321" ;
//121932631112635269		
		
		BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.multiply(b);
        System.out.println(c); 
	}
}
