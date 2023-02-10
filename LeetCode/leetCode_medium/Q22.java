package leetCode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	22. Generate Parentheses
		Given n pairs of parentheses, write a function to generate all combinations 
		of well-formed parentheses.
		Example 1:
		Input: n = 3
		Output: ["((()))","(()())","(())()","()(())","()()()"]
		Example 2:
		Input: n = 1
		Output: ["()"]
 */
public class Q22 {
	public static void main(String[] args) {

		int n = 3 ;

		List<String> res = new ArrayList<String>();	
		recurse(res, 0, 0, "", n);		
		System.out.println(res);
	}

	public static void recurse(List<String> res, int left, int right, String s, int n) 
	{	
		if (s.length() == n * 2) {
			res.add(s);
			return;
		}

		if (left < n) {
			recurse(res, left + 1, right, s + "(", n);
		}

		if (right < left) {
			recurse(res, left, right + 1, s + ")", n);
		}
	}
}
