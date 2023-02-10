package leetCode_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 229. Majority Element II
		Given an integer array of size n, find all 
		elements that appear more than ⌊ n/3 ⌋ times.
		Example 1:
		Input: nums = [3,2,3]
		Output: [3]
		Example 2:
		Input: nums = [1]
		Output: [1]
		Example 3:
		Input: nums = [1,2]
		Output: [1,2]
 */
public class Q229 {
	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		
		Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int n=nums.length;
        
        List<Integer> list=new ArrayList<>();
         for (Map.Entry<Integer,Integer> entry : map.entrySet())  
            if(entry.getValue()>n/3)
                list.add( entry.getKey()); 
        
        System.out.println(list);
	}
}
