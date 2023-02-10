package leetCode_easy;
//	Given an integer x, return true if x is a palindrome, and false otherwise.
/*
	Input: x = -121
	Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */
public class Q9 {
	public static void main(String[] args) {
		
			int x = -121;
		 	int i = x;
	        int rNum = 0;
	        while(x != 0)
	        {
	            rNum = (x%10) + rNum*10; 
	            x /= 10;
	        }
	       System.out.println(i==rNum); 
	}
}
