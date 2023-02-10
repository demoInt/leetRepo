package leetCode_easy;
/*
		 Given a sorted array of distinct integers and a target value, return 
		 the index if the target is found. 
		 If not, return the index where it would be if it were inserted in order.
		You must write an algorithm with O(log n) runtime complexity.
		Input: , target = 5
		Output: 2
		Input: nums = [1,3,5,6], target = 2
		Output: 1
 */
public class Q35 {
	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 5;
		  int index = 0;
	        
	        for(int i = 0; i < nums.length ; i++)
	        {
	            if(target < nums[0])
	            {
	                System.out.println(0);
	            }
	            if(nums[i] == target)
	            {
	                System.out.println(i);
	            }
	            if(nums[i] < target)
	            {
	                index = i;
	            }
	        }
	        System.out.println(index+1);
		
	}
}
