package leetCode_hard;

import java.util.Arrays;
import java.util.Iterator;

/*135. Candy
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.
Example 1:
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 */
public class Q135 {
	public static void main(String[] args) {
		
	//	int[] ratings = {1,3,2,2,1};
	//	int[] ratings = {1,2,2};
	//	int[] ratings = {1,0,2};
	//	int[] ratings = {5,3,2,1,2,6,5,4,4,7};
		int[] ratings = {1,2,87,87,87,2,1};
		
		int[] candyAllocation1 = new int[ratings.length];
		int[] candyAllocation2 = new int[ratings.length];
		int candyCount = 0 ;
		
		System.out.println(Arrays.toString(ratings));
		
		for (int i = ratings.length-2; i > 0; i--) 
		{
			if(ratings[i] > ratings[i+1])
			{
				candyAllocation1[i] = candyAllocation1[i+1] + 1;
			}
		}
		System.out.println(Arrays.toString(candyAllocation1));
		
		for (int i = 1; i < candyAllocation2.length; i++) 
		{
			if(ratings[i] > ratings[i-1])
			{
				candyAllocation2[i] = candyAllocation2[i-1] + 1;
			}
		}
		System.out.println(Arrays.toString(candyAllocation2));
		
		for (int i = 0; i < ratings.length; i++) {
			candyCount += candyAllocation1[i] > candyAllocation2[i] ? candyAllocation1[i] + 1 : candyAllocation2[i] + 1;
		}
		System.out.println(candyCount);
	}
}
