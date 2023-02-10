package leetCode_easy;

import java.util.Arrays;

/*
	 Given an array, rotate the array to the right by k steps, where k is non-negative.
	Example 1:
	
	Input: nums = [1,2,3,4,5,6,7], k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
	Example 2:
	
	Input: nums = [-1,-100,3,99], k = 2
	Output: [3,99,-1,-100]
	Explanation: 
	rotate 1 steps to the right: [99,-1,-100,3]
	rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Q189 {
	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7}; 
		int k = 3;
		
		if(a.length < k)
        {
			 for (int j = 0; j < k  ; j++) {

					int temp = a[a.length-1];
					for (int i = a.length - 1 ; i>0 ;i-- ) 
					{
						a[i] = a[i-1];
					}
					a[0] = temp;
				}
        }
		 
		int[] newArr = new int[k];
        
        for(int i = a.length-k,j = 0 ; i < a.length ; i++, j++)
        {
            newArr[j] = a[i] ;
        }
        for(int i = 0 ; i < a.length - k ; i++)
        {
            a[a.length - 1 -i] = a[a.length - 1 -k - i];
        }
        for (int i = 0; i < k; i++) {
			a[i] = newArr[i] ;
		}
        System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(a));

	}
}
