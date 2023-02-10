package leetCode_easy;

import java.util.Arrays;

/*
 * 
 977. Squares of a Sorted Array
		Given an integer array nums sorted in non-decreasing order, 
		return an array of the squares of each number sorted in non-decreasing order.
		Example 1:
		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
		Example 2:
		
		Input: nums = [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
		
 */
public class Q977 {
	public static void main(String[] args) {
		
		int[] nums = {-4,-1,0,3,10};
		/*
		int[] squares = new int[nums.length];
		
		for (int i = 0; i < squares.length; i++) {
			squares[i] = nums[i]*nums[i];
		}
		System.out.println(Arrays.toString(squares));
		*/
		
		int[] array = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;
        while(i<=j)
        {
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];
//            int val1 = nums[i] ;
//            int val2 = nums[j] ;
        
            if(val1 > val2)
            {
                array[k] = val1;
                i++;
            }
            else
            {
                array[k] = val2;
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(array));
		
		
	}
}
