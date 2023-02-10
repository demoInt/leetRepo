package leetCode_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
	 503. Next Greater Element II
		  Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] 
		  is nums[0]), return the next greater number for every element in nums.
		  The next greater number of a number x is the first greater number to its 
		  traversing-order next in the array, which means you could search circularly to find 
		  its next greater number. If it doesn't exist, return -1 for this number.
		  Example 1:
		  Input: nums = [1,2,1]
		  Output: [2,-1,2]
		  Explanation: The first 1's next greater number is 2; 
		  The number 2 can't find next greater number. 
		  The second 1's next greater number needs to search circularly, which is also 2.
		  Example 2:
		  Input: nums = [1,2,3,4,3]
		  Output: [2,3,4,-1,4]
 */
public class Q503 {
	public static void main(String[] args) {
		
		int[] nums = {5,4,3,2,1};
		/*
		int[] nums1 = new int[nums.length];
		int count = 0 ;
		
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>() ;
		
		for (int i = 0; i < nums.length; i++) 
		{
			if(!stack.isEmpty() && nums[i] > stack.peek())
			{
				map.put(stack.pop(),nums[i]);
			}
			stack.push(nums[i]);
			if(i == nums.length-2)
			{
				stack.clear();
			}
		}
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.getOrDefault(nums[i], -1) ; 
		}
		.
		System.out.println(map);
		System.out.println(Arrays.toString(nums1));*/
		
		Stack<Integer> s = new Stack<Integer>();
        int[] answer = new int[nums.length];
        int i=1;
        s.push(0);
        
        while(i<nums.length) 
        {
            if(!s.isEmpty())
            {
                if(nums[s.peek()]>=nums[i])
                {
                    s.push(i);
                }else
                {
                    answer[s.pop()]=nums[i];
                    continue;
                }
            }else
            {
                s.push(i);
            }
            
            i++;
        }
        
        i=0;
        
        while(!s.isEmpty() && i<nums.length)
        {
            
            if(nums[i]>nums[s.peek()])
            {
                answer[s.pop()]=nums[i];
                
            }
            else
            {
                i++;
            }
        }
       
        while(!s.isEmpty())
            answer[s.pop()]=-1;
        
        System.out.println(Arrays.toString(answer));
		
	}
}
