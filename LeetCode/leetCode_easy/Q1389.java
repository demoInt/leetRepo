package leetCode_easy;

import java.util.ArrayList;
import java.util.Arrays;

/* 1389. Create Target Array in the Given Order
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */
public class Q1389 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1} ;
	//	output =  {0,4,1,3,2};

	/*	int[] target = new int[nums.length];

		for(int i = 0 ; i < target.length ; i++)
		{
			if(target[index[i]] > -1)
			{
				for(int j = target.length - 1 ; j > index[i]  ; j-- )
				{
					target[j] = target[j - 1];
				}
				target[index[i]] = nums[i];
			}
			else
			{
				target[index[i]] = nums[i];
			}
		}
		System.out.println(Arrays.toString(target));
	*/
		
		//saving in arraylist (inserting at specified index shifts the element automatically )
		ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
          //  System.out.println(a);
        }
        Object target[] = a.toArray();
        System.out.println(Arrays.toString(target));
	}
}
