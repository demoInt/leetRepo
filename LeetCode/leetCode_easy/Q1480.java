package leetCode_easy;
/*
	 Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	 Return the running sum of nums.
	 Input: nums = [1,2,3,4]
	 Output: [1,3,6,10]
	 Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class Q1480 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[]  sum = new int[nums.length] ; 
	       sum[0] = nums[0]; 
	        for(int i = 1 ; i < sum.length ; i++)
	        {
	            sum[i] = sum[i-1] + nums[i];
	        }
	      System.out.println(sum);
		
	}
}
