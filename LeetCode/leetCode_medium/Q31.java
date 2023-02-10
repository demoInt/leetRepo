package leetCode_medium;

import java.util.Arrays;

/*
 31. Next Permutation
Medium
13.8K
3.9K
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations 
of the array are sorted in one container according to their lexicographical order, then the next permutation of 
that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be 
rearranged as the lowest possible order (i.e., sorted in ascending order).
For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.
Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 */
public class Q31 {
	public static void main(String[] args) 
	{	
		int[] elements = {1,3,4,2};
		//         0 1 2 3
//		int[] elements = {4,3,2,1};
//		int[] elements = {1,2,3,4};
			
		if(checkForTheLast(elements))
		{
			reverse(elements, 0);
			System.out.println("next permutaiton : "+Arrays.toString(elements));
			return;
		}

		int i = findDecreaseIndex(elements);
				System.out.println("decreased element index :  "+i);

		int j = findBiggerElementInTheRightSide(elements , i);
				System.out.println("bigger element right to i's index is :  "+j);

		swap(elements , i , j);
				System.out.println(Arrays.toString(elements));

		reverse(elements , i+1);
		System.out.println("next permutation : "+Arrays.toString(elements));
	}

	static int findDecreaseIndex(int[] elements)
	{
		int index = -1;
		for (int i = elements.length-2; i >= 0; i--) {

			if(elements[i] < elements[i+1])
			{
				index = i;
				break;
			}
		}
		return index;
	}

	static int findBiggerElementInTheRightSide(int[] elements , int i)
	{
		int index = -1;
		for (int j = elements.length-1; j > i; j--) {

			if(elements[j] > elements[i])
			{
				index = j;
				break;
			}
		}
		return index ;
	}
	
	static void swap (int[] elements , int i , int j)
	{
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp ;
	}
	
	static void reverse(int[] elements, int i)
	{
		int middle = i +((elements.length - i)/2);
		int temp ; 
		for (int j = i; j < middle; j++) 
		{
			temp = elements[j];
			elements[j] = elements[elements.length - 1 - (j-i)];
			elements[elements.length - 1 - (j-i)] = temp ;
		}
	}
	
	static boolean checkForTheLast(int[] elements)
	{
		boolean descending = true;
		for (int i = 0; i < elements.length - 1; i++) {
			
			if(elements[i] < elements[i+1])
			{
				descending = false;
				break;
			}
		}
		return descending;
	}
}
/*
Steps to be followed to get next permutation : 
1. from the right move towards left till you find any decrement. that decrement value index(assume i)
2. from i on right find out which value is bigger starting from right most (consider index as j) going towards leftmost 
3. i and j indexed values should be swapped .
4. After i index all value should be reversed .
*/
/*
1,2,3,4
1,2,4,3
1,3,2,4
1,3,4,2
1,4,2,3
1,4,3,2
2,1,3,4
2,1,4,3 
..and so on                   
*/
//Logic holds valid for all but not for last to first permutation .
//we are checking if the given array is last iteration(all elements will be in decreasing order) , 
//then we have to move to first permutation , for this we have included an if block in the beginning