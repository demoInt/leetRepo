package leetCode_easy;
/*
 Given an integer array sorted in non-decreasing order, there is exactly 
 one integer in the array that occurs more than 25% of the time, return that integer.
Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:
Input: arr = [1,1]
Output: 1
 */
public class Q1287 {

	public static void main(String[] args) {

		int[] arr = {1,2,2,6,6,6,6,7,10};
		
		int twentyClub = ((arr.length)/4) ;
        int n = 0;

        if(arr.length == 1)
        {
            System.out.println(arr[0]);
        }
        
        for (int i = 0; i < arr.length; i++) 
        {		
                if(arr[i] == arr[i+twentyClub])
                {
                    n = arr[i];
                    break;
                }
        }
        
        System.out.println(n);
		
		
	}
}
