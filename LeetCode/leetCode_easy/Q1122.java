package leetCode_easy;

import java.util.Arrays;
import java.util.Iterator;

/*
 1122. Relative Sort Array
		Given two arrays arr1 and arr2, the elements of arr2 are distinct, 
		and all elements in arr2 are also in arr1.
		Sort the elements of arr1 such that the relative ordering of items in arr1 
		are the same as in arr2. Elements that do not appear in arr2 should be placed at 
		the end of arr1 in ascending order.
		Example 1:
		Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
		Output: [2,2,2,1,4,3,3,9,6,7,19]
		Example 2:
		Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
		Output: [22,28,8,6,17,44]
 */
public class Q1122 {
	public static void main(String[] args) {
		
		int[] arr1 = {26,21,11,20,50,34,1,18};
		int[] arr2 = {21,11,26,20} ;
		
		
			   int largest = 0;
			// get the largest element from arr1
	        for(int i=0; i<arr1.length; i++) 
	            largest = Math.max(arr1[i], largest);
	        
			// create an array of size (largest+1) to store frequencies of elements in arr1
	        int[] frequencies = new int[largest+1];
	        for(int i=0; i<arr1.length; i++) 
	            frequencies[arr1[i]]++;
 	       
	        int index = 0;
	        for(int i=0;  i<arr2.length;  i++){
			// insert the current element of arr2 till freqeuncy of this element in arr1 becomes 0
	            while((frequencies[arr2[i]]--) > 0) 
	                arr1[index++] = arr2[i];
	        }
	        System.out.println(Arrays.toString(arr1));	
	        int sortIndex = index ;
			// insert the remaining elements of arr1 as per their frequencies  which were not present in arr2
	        for(int i=1;  i<frequencies.length;  i++){
	            while((frequencies[i]--) > 0)  
	                arr1[index++] = i;
	        }
	        
	        System.out.println(Arrays.toString(arr1));	
	        for (int i = sortIndex; i < arr1.length; i++) {
				for (int j = sortIndex; j < arr1.length-1; j++) {
					if(arr1[j] > arr1[j+1])
					{
						int temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp ;
						
					}
				}
			}
	        System.out.println(Arrays.toString(arr1));		
	}
}
