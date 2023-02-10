package leetCode_hard;
/*
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class Q42 {
public static void main(String[] args) {
	
	int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	
	int[] blockHeights = height;
    int[] leftMaxValues = new int[blockHeights.length];
	int[] rightMaxValues = new int[blockHeights.length];
	
	leftMaxValues[0] = blockHeights[0];
	rightMaxValues[blockHeights.length - 1] = blockHeights[blockHeights.length - 1];
	
	for(int i = 1; i < blockHeights.length; i++)
	{
		if(leftMaxValues[i - 1] > blockHeights[i])
		{
			leftMaxValues[i] = leftMaxValues[i - 1];
		}
		else
		{
			leftMaxValues[i] = blockHeights[i];
		}
	}
	for(int i = blockHeights.length - 2; i >= 0; i--)
	{
		if(blockHeights[i] > rightMaxValues[i + 1])
		{
			rightMaxValues[i] = blockHeights[i];
		}
		else
		{
			rightMaxValues[i] = rightMaxValues[i + 1];
		}
	}

	int leftMax, rightMax, minMax, waterCapacity = 0;		
	for(int i = 1; i < blockHeights.length - 1; i++)
	{
		leftMax = leftMaxValues[i];
		rightMax = rightMaxValues[i];
		minMax = leftMax < rightMax ? leftMax : rightMax ;
		if(minMax > 0 && (minMax - blockHeights[i]) > 0)
		{
			waterCapacity += (minMax - blockHeights[i]);
		}
	}
	System.out.println(waterCapacity);
}
}
