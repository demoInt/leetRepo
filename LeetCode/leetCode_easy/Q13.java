package leetCode_easy;
//not resolved
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 13. Roman to Integer
 Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class Q13 {
	public static void main(String[] args) {

//		String s = "IIIV"; 
//
//
//		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
//		m.put('I',1);
//		m.put('V',5);
//		m.put('X',10);
//		m.put('L',50);
//		m.put('C',100);
//		m.put('D',500);
//		m.put('M',1000);
//	
//		char [] c = s.toCharArray();
//		int [] n = new int[c.length];
//		
//		for(int i=0;i<n.length;i++) {
//			
//			n[i]=m.get(c[i]);
//		}
//		
//		int sum=0;
//		for(int i=0;i<n.length;i++) 
//		{
//			sum = i==c.length-1||n[i]>=n[i+1]?sum+n[i]:sum-n[i];
//		}
//		System.out.println(sum); 
		
		  	String rNum = "III";
		 
	        int[] number = new int[rNum.length()];

			for (int i = 0; i < rNum.length(); i++) {

				switch(rNum.charAt(i))
				{
				case 'I' : number[i] = 1;
				break;
				case 'V' : number[i] = 5;
				break;
				case 'X' : number[i] = 10;
				break;
				case 'L' : number[i] = 50;
				break;
				case 'C' : number[i] = 100;
				break;
				case 'D' : number[i] = 500;
				break;
				case 'M' : number[i] = 1000;
				break;
				default : System.out.println("Invalid Roman Numeral"); 			
				}	
			}
			int numInt = 0 ;
			
			for (int i = 0; i < number.length-1; i++) {
				
				if(number[i] < number[i+1])
				{
					numInt -= number[i];
				}
				else
				{
					numInt += number[i];
				}
			}
			
			System.out.println(numInt + number[number.length-1]);
			
		
//			String s = "IIIV" ;
//			int ans = 0, num = 0;
//	        for (int i = s.length()-1; i >= 0; i--) {
//	            switch(s.charAt(i)) {
//	                case 'I': num = 1; break;
//	                case 'V': num = 5; break;
//	                case 'X': num = 10; break;
//	                case 'L': num = 50; break;
//	                case 'C': num = 100; break;
//	                case 'D': num = 500; break;
//	                case 'M': num = 1000; break;
//	            }
//	            if (4 * num < ans) ans -= num;
//	            else ans += num;
//	        }
//	        System.out.println(ans);
	        
	    }
		
	}




