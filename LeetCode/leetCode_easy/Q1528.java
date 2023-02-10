package leetCode_easy;

import java.util.Arrays;

/*
  s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	Output: "leetcode" /*

 */
public class Q1528 {
	public static void main(String[] args) {
		
		String s = "codeleet";
		
		int[] indices = {4,5,6,7,0,2,1,3} ;
		char[] sCorrect = new char[indices.length];
		
		for (int i = 0; i < sCorrect.length; i++) {
			
			sCorrect[indices[i]] = s.charAt(i);
			
		}
		System.out.println(Arrays.toString(sCorrect));
		
		String sui = new String(sCorrect);
		System.out.println(sui);
	}
}
