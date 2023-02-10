package leetCode_easy;
/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter 
what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
 */
public class Q26 {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		 int count = 0;
	       for(int i = 0 ; i < nums.length - count ; i++)
	        {
	            for(int j = i+1; j < nums.length - count ; j++ )
	            {
	                if(nums[i] == nums[j])
	                {
	                    for(int k = j ; k < nums.length - 1 - count ; k++)
	                    {
	                        nums[k] = nums[k+1];
	                    }
	                    count++;
	                    j--;
	                }
	            }
	        }
	        int uniqueElements = nums.length-count;
	        System.out.println(uniqueElements);   
		
	}
}
