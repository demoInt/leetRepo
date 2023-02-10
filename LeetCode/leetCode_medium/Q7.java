package leetCode_medium;
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Q7 {
	public static void main(String[] args) {

		int x = 1523654899;
		double i = 0;
        while( x != 0)
        {
            i = x % 10 + i * 10;
            x /= 10;
        }
        if(i > Integer.MAX_VALUE || i < Integer.MIN_VALUE)
        {
            System.out.println(0); 
        }
     System.out.println((int)i);
	}
}
